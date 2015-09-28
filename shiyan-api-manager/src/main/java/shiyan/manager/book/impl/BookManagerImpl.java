package shiyan.manager.book.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shiyan.dao.book.BookDao;
import shiyan.manager.book.BookManager;

/**
 * Created by Administrator on 2015/9/15.
 */
@Component("bookManager")
public class BookManagerImpl implements BookManager {
    @Autowired
    private BookDao bookDao;

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
}
