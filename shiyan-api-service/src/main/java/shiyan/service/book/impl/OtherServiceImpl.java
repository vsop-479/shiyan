package shiyan.service.book.impl;

import org.springframework.stereotype.Service;
import shiyan.domain.Article;
import shiyan.service.book.BookService;

/**
 * Created by Administrator on 2015/9/14.
 */
@Service("otherService")
public class OtherServiceImpl implements BookService {
    @Override
    public boolean doService() {
        System.out.println("OtherServiceImpl");
        return false;
    }

    @Override
    public Article getBook() {
        return null;
    }
}
