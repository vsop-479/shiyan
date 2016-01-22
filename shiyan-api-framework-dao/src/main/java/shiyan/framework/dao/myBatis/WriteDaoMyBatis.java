package shiyan.framework.dao.myBatis;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import shiyan.framework.dao.WriteDao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/8/21.
 */
public class WriteDaoMyBatis<T, PK extends Serializable> extends BaseDaoMyBatis<T, PK> implements WriteDao<T, PK> {
    @Override
    public boolean exists(PK id) {
        return false;
    }

    @Override
    public int insert(T object) {
        return getSqlSession().insert(MyBatisUtil.insertSql(getClazz().getSimpleName()), object);
    }

    @Override
    public int batchInsert(List<T> list) {
        return getSqlSession().insert(MyBatisUtil.batchInsertSql(getClazz().getSimpleName()), list);
    }

    @Override
    public int batchInsertIgnoreError(List<T> list) {
        SqlSession sqlSession = ((SqlSessionTemplate) getSqlSession()).getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
        for(T t : list){
            sqlSession.insert(MyBatisUtil.insertSql(getClazz().getSimpleName()), t);
        }
        List<BatchResult> batchResults = sqlSession.flushStatements();
        sqlSession.close();
        return batchResults.size();
    }

    @Override
    public int update(T object) {
        return getSqlSession().update(MyBatisUtil.updateSql(getClazz().getSimpleName()), object);
    }

    @Override
    public int batchUpdate(List<T> list) {
        return getSqlSession().update(MyBatisUtil.batchUpdateSql(getClazz().getSimpleName()), list);
    }

    @Override
    public int batchUpdateIgnoreError(List<T> list) {
        SqlSession sqlSession = ((SqlSessionTemplate) getSqlSession()).getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
        for(T t : list){
            sqlSession.update(MyBatisUtil.updateSql(getClazz().getSimpleName()), t);
        }
        List<BatchResult> batchResults = sqlSession.flushStatements();
        sqlSession.close();
        return batchResults.size();
    }

    @Override
    public int delete(PK id) {
        return getSqlSession().delete(MyBatisUtil.deleteSql(getClazz().getSimpleName()), id);
    }
}
