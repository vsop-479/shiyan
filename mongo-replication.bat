//replication
//1按replSet 启动三个mongod服务
mongod --port 27101 --replSet rs1 --dbpath D:\MongoServer\data\rs1\27101\ --logpath D:\MongoServer\log\rs1\27101\27101.log --smallfiles --oplogSize 128
mongod --port 27102 --replSet rs1 --dbpath D:\MongoServer\data\rs1\27102\ --logpath D:\MongoServer\log\rs1\27102\27102.log --smallfiles --oplogSize 128
mongod --port 27103 --replSet rs1 --dbpath D:\MongoServer\data\rs1\27103\ --logpath D:\MongoServer\log\rs1\27103\27103.log --smallfiles --oplogSize 128
//2连接其中一个mongod服务,进行配置
mongo --host localhost --port 27101
//rs1conf初始配置
rs1conf = {
              _id: "rs1",
              members: [
                  {
                      _id: 0,
                      host: "localhost:27101"
                  }
              ]
          }
rs2conf = {
              _id: "rs2",
              members: [
                  {
                      _id: 0,
                      host: "localhost:27201"
                  }
              ]
          }
//初始化
rs.initiate(rs1conf)
//查看rs配置
rs.conf()
//重新配置rs
rs.reconfig(cfg)
//查看rs当前状态
rs.status()
//3添加成员
rs.add("localhost:27102")
//添加仲裁成员(arbiter only)
rs.addArb("localhost:27103")