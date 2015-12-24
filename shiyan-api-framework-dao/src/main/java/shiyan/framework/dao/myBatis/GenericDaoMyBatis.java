package shiyan.framework.dao.myBatis;

import org.apache.ibatis.session.SqlSession;
import shiyan.framework.dao.GenericDao;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/21.
 */
public class GenericDaoMyBatis<T, PK extends Serializable> extends ReadDaoMyBatis<T, PK> implements GenericDao<T, PK> {
    private WriteDaoMyBatis<T, PK> writeDaoMyBatis;

    @Override
    public boolean exists(PK id) {
        return writeDaoMyBatis.exists(id);
    }

    @Override
    public T save(T object) {
        return writeDaoMyBatis.save(object);
    }

    @Override
    public void remove(PK id) {
        writeDaoMyBatis.remove(id);
    }

    public GenericDaoMyBatis(){
        writeDaoMyBatis = new WriteDaoMyBatis<T, PK>();
    }

    public void setSqlSession(SqlSession sqlSession){
        super.setSqlSession(sqlSession);
        writeDaoMyBatis.setSqlSession(sqlSession);
    }

    public void setClazz(Class<T> clazz) {
        super.setClazz(clazz);
        writeDaoMyBatis.setClazz(clazz);
    }
}
