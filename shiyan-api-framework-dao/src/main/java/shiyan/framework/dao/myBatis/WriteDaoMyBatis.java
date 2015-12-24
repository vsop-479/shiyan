package shiyan.framework.dao.myBatis;

import shiyan.framework.dao.WriteDao;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/21.
 */
public class WriteDaoMyBatis<T, PK extends Serializable> extends BaseDaoMyBatis<T, PK> implements WriteDao<T, PK> {
    @Override
    public boolean exists(PK id) {
        return false;
    }

    @Override
    public T save(T object) {
        getSqlSession().insert(MyBatisUtil.saveSql(getClazz().getSimpleName()), object);
        return object;
    }

    @Override
    public void remove(PK id) {

    }
}
