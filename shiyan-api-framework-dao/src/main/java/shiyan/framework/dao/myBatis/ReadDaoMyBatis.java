package shiyan.framework.dao.myBatis;

import shiyan.framework.dao.ReadDao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2015/8/21.
 */
public class ReadDaoMyBatis<T, PK extends Serializable> extends BaseDaoMyBatis<T, PK> implements ReadDao<T, PK> {


    @Override
    public List<T> getAll() {
        List<T> objects = getSqlSession().selectList(MyBatisUtil.getAllSql(getClazz().getSimpleName()));
        return objects;
    }

    @Override
    public List<T> getAllDistinct() {
        List<T> objects = getSqlSession().selectList(MyBatisUtil.getAllDistinctSql(getClazz().getSimpleName()));
        return objects;
    }

    @Override
    public T get(PK id) {
        T o = getSqlSession().selectOne(MyBatisUtil.getByIdSql(getClazz().getSimpleName()), id);
        return o;
    }

    @Override
    public List<T> get(T o){
        List<T> objects = getSqlSession().selectList(MyBatisUtil.getSql(getClazz().getSimpleName()), o);
        return objects;
    }

    @Override
    public List<T> getPage(int pageNO, int pageSize, HashMap<String, Object> conditions) {
        return null;
    }
}
