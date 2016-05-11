package shiyan.dao.book.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import shiyan.dao.book.BookDao;
import shiyan.domain.Article;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/15.
 * TODO zk分离服务, maybe
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
    public Article getArticle(Map map) {
        Query query = new Query();
        if(map != null && !map.isEmpty()){
            Criteria criteria = new Criteria();
            Iterator iterator = map.keySet().iterator();
            String key = String.valueOf(iterator.next());
            Object value = map.get(key);
            criteria = criteria.where(key).is(value);
            while(iterator.hasNext()){
                key = String.valueOf(iterator.next());
                value = map.get(key);
                criteria = criteria.andOperator(new Criteria().where(key).is(value));
            }
            query.addCriteria(criteria);
        }

        Article one = mongoTemplateGW.findOne(query, Article.class, "articles");
        return one;
    }

    public void add(Article article)throws Exception{
        mongoTemplateGW.insert(article, "articles");
    }

    @Override
    public List<Article> getArticles() {
        List<Article> articles = mongoTemplateGW.find(new Query(), Article.class, "articles");
        return articles;
    }
}
