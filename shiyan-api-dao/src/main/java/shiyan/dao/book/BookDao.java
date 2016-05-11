package shiyan.dao.book;

import org.springframework.stereotype.Repository;
import shiyan.domain.Article;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/15.
 */
@Repository
public interface BookDao {
    public void doDao();
    public Article getArticle(Map map);
    public List<Article> getArticles();
    public void add(Article article)throws Exception;
}
