package shiyan.framework.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/8/21.
 */
public interface WriteDao<T, PK extends Serializable> {
    boolean exists(PK id);
    int insert(T object);
    int batchInsert(List<T> list);
    int batchInsertIgnoreError(List<T> list);
    int update(T object);
    int batchUpdate(List<T> list);
    int batchUpdateIgnoreError(List<T> list);
    int delete(PK id);
}
