package shiyan.dao.user.impl;

import shiyan.dao.user.UserDao;
import shiyan.domain.user.User;
import shiyan.framework.dao.myBatis.GenericDaoMyBatis;

/**
 * Created by Administrator on 2016/5/13.
 */
public class UserDaoImpl extends GenericDaoMyBatis<User, String> implements UserDao {
}
