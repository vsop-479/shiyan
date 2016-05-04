package shiyan.dao.book.impl;

import org.bson.codecs.configuration.CodecRegistries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import shiyan.dao.book.BookDao;
import shiyan.domain.Article;

/**
 * Created by Administrator on 2015/9/15.
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
      @Autowired
     private MongoTemplate mongoTemplateGW;
//    @Autowired
//    private RedisUtils redisUtils;
//
//    public RedisUtils getRedisUtils() {
//        return redisUtils;
//    }
//
//    public void setRedisUtils(RedisUtils redisUtils) {
//        this.redisUtils = redisUtils;
//    }

    @Override
    public void doDao() {
        System.out.println("BookDaoImpl");
    }

    @Override
    public Article getArticle() {
        Article one = mongoTemplateGW.findOne(new Query(), Article.class, "articles");
        return one;
    }
}
