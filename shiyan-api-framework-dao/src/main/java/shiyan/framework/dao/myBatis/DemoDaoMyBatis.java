package shiyan.framework.dao.myBatis;

import shiyan.framework.dao.DemoDao;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/21.
 */
public class DemoDaoMyBatis<T, PK extends Serializable> extends GenericDaoMyBatis<T, PK> implements DemoDao<T, PK> {
    @Override
    public void nonGenericOp() {
        //TODO
    }
}
