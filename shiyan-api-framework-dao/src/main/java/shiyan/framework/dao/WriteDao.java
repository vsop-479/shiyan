package shiyan.framework.dao;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/21.
 */
public interface WriteDao<T, PK extends Serializable> {
    boolean exists(PK id);
    T save(T object);
    void remove(PK id);
}
