package shiyan.dao.book.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shiyan.dao.book.BookDao;

/**
 * Created by Administrator on 2015/9/15.
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
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
}
