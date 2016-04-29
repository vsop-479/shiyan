use gw;
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