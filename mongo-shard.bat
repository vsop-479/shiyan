//mongo3.2之后，配置服务器已改为副本集配置，之前为3个镜像服务器
//配置服务器的副本集，有如下限制：
//不能有仲裁成员
//不能有延迟成员
//每个成员都能建立索引
//1--configsvr --replSet启动三个节点
mongod --port 27901 --configsvr --replSet rs9 --dbpath D:\MongoServer\data\rs9\27901\ --logpath D:\MongoServer\log\rs9\27901\27901.log --smallfiles --oplogSize 128
mongod --port 27902 --configsvr --replSet rs9 --dbpath D:\MongoServer\data\rs9\27902\ --logpath D:\MongoServer\log\rs9\27902\27902.log --smallfiles --oplogSize 128
mongod --port 27903 --configsvr --replSet rs9 --dbpath D:\MongoServer\data\rs9\27903\ --logpath D:\MongoServer\log\rs9\27903\27903.log --smallfiles --oplogSize 128
//2配置服务器的rs配置
mongo --host localhost --port 27901
rs9conf = {
    _id: "rs9",
    configsvr: true,
    members: [
        {_id: 0, host: "localhost:27901"},
        {_id: 1, host: "localhost:27902"},
        {_id: 2, host: "localhost:27903"}
    ]
}
rs.initiate(rs9conf)
//3启动mongos, 连接到配置服务器
mongos --port 27000 --configdb rs9/localhost:27901,localhost:27902,localhost:27903 --logpath D:\MongoServer\log\mongos\27000\27000.log
//4连接到mongos,添加分片
mongo --host localhost --port 27000
//添加副本集分片
sh.addShard("rs1/localhost:27101")
sh.addShard("rs2/localhost:27201")
//添加单服分片
sh.addShard("localhost:27017")
//查看sharding状态
sh.status()
//设置数据库可分片
sh.enableSharding("foo")
//设置集合片键
//如果集合已经有数据, 设置片键之前, 必须手动建索引
//如果集合还没有数据, 设置片键时, 会自动建索引
//创建hash索引(version2.4新加)
db.users.createIndex({oid: "hashed"})
//oid片键, hash分片
sh.shardCollection("foo.users", {"oid": "hashed"})
//zipcode升序片键, 当zipcode值相同时, 以name分chunk
sh.shardCollection("foo.users", {"zipcode": 1, "name": 1})