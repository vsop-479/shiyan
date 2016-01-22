package shiyan.framework.dao.myBatis;

import org.apache.ibatis.session.SqlSession;
import shiyan.framework.dao.GenericDao;

import java.io.Serializable;
import java.util.List;

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
    public int insert(T object) {
        return writeDaoMyBatis.insert(object);
    }

    @Override
    public int batchInsert(List<T> list) {
        return writeDaoMyBatis.batchInsert(list);
    }

    @Override
    public int batchInsertIgnoreError(List<T> list) {
        return writeDaoMyBatis.batchInsertIgnoreError(list);
    }

    @Override
    public int update(T object) {
        return writeDaoMyBatis.update(object);
    }

    @Override
    public int batchUpdate(List<T> list) {
        return writeDaoMyBatis.batchUpdate(list);
    }

    @Override
    public int batchUpdateIgnoreError(List<T> list) {
        return writeDaoMyBatis.batchUpdateIgnoreError(list);
    }

    @Override
    public int delete(PK id) {
        return writeDaoMyBatis.delete(id);
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
