package shiyan.service.book;

import org.springframework.stereotype.Service;
import shiyan.domain.Article;

/**
 * Created by Administrator on 2015/9/14.
 */
@Service
public interface BookService {
    public boolean doService();
    public Article getBook();
}
