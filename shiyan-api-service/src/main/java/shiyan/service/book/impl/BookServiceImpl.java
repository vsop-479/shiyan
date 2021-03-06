package shiyan.service.book.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shiyan.domain.Article;
import shiyan.manager.book.BookManager;
import shiyan.service.book.BookService;

import java.util.Map;

/**
 * Created by Administrator on 2015/9/14.
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookManager bookManager;

    public BookManager getBookManager() {
        return bookManager;
    }

    public void setBookManager(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    @Override
    public boolean doService() {
        System.out.println("BookServiceImpl");
        bookManager.doManager();
        return false;
    }

    public Article getBook(Map map){
        return bookManager.getBook(map);
    }

    public void addArticle(Article article)throws Exception{
        bookManager.add(article);
    }
}
