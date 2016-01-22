package shiyan.framework.dao.myBatis;

import org.apache.ibatis.session.SqlSession;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/24.
 */
public class BaseDaoMyBatis<T, PK extends Serializable> {
    private SqlSession sqlSession;
    private Class<T> clazz;

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }
}
