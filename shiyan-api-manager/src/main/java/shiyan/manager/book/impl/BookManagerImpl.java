package shiyan.manager.book.impl;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shiyan.common.mongo.MongoUtil;
import shiyan.dao.book.BookDao;
import shiyan.manager.book.BookManager;
import shiyan.domain.Article;
/**
 * Created by Administrator on 2015/9/15.
 */
@Component("bookManager")
public class BookManagerImpl implements BookManager {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private MongoUtil mongoUtil;
//    @Autowired
//    private MongoClient mongo;


    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void doManager() {
        System.out.println("BookManagerImpl");
        bookDao.doDao();
    }

    public Article getBook(){
//        MongoCollection<Document> collection = mongoUtil.getCollection("guwen", "articles");
//        FindIterable<Document> documents = collection.find();
//        MongoCursor<Document> iterator = documents.iterator();
//        Document next = iterator.next();
//        Article article = new Gson().fromJson(next.toJson(), Article.class);
        Article article = bookDao.getArticle();


        return article;
    }
}
