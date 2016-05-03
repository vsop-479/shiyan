//不存在则创建
use gw;
db.createCollection("users");
db.getCollectionNames();
db.book.find();
//此为mongo3以前的用法---start-----
db.adminCommand({"setParameter":1,"textSearchEnabled":true});
db.book.ensureIndex({"content":"text"});
db.runCommand({"text":"book","search":"爱"});
//此为mongo3以前的用法---end-----
//mongo3的用法---start-----
db.book.createIndex({content:"text"}, {default_language:"zhs"});
db.book.find({$text:{$search:"爱"}});
//mongo3的用法---end-----
db.book.getIndexes();
db.book.dropIndex(iName);
//mongo启动
mongod --port 9911 --dbpath E:\MongoDB\Server\3.2\data\9911\ --logpath E:\MongoDB\Server\3.2\log\9911.log --logappend
mongo --host localhost --port 9911