package shiyan.dao.book;

import org.springframework.stereotype.Repository;
import shiyan.domain.Article;

/**
 * Created by Administrator on 2015/9/15.
 */
@Repository
public interface BookDao {
    public void doDao();
    public Article getArticle();
}
