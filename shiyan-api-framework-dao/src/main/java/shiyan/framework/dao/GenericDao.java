package shiyan.framework.dao;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/21.
 */
public interface GenericDao<T, PK extends Serializable> extends ReadDao<T, PK>, WriteDao<T, PK> {
}
