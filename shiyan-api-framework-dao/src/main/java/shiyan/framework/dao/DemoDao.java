package shiyan.framework.dao;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/21.
 */
public interface DemoDao<T, PK extends Serializable> extends GenericDao<T, PK> {
    public void nonGenericOp();
}
