package shiyan.framework.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2015/8/21.
 */
public interface ReadDao<T, PK extends Serializable> {
    List<T> getAll();
    List<T> getAllDistinct();
    T get(PK id);
    List<T> get(T o);
    List<T> getPage(int pageNO, int pageSize, HashMap<String, Object> conditions);
}
