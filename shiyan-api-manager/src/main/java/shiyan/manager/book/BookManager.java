package shiyan.manager.book;

import org.springframework.stereotype.Component;
import shiyan.domain.Book;

/**
 * Created by Administrator on 2015/9/15.
 */
@Component
public interface BookManager {
    public void doManager();
    public Book getBook();
}
