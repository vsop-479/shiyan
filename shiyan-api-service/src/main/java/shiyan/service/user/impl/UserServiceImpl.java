package shiyan.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shiyan.common.utils.DateUtil;
import shiyan.dao.user.UserDao;
import shiyan.domain.user.User;
import shiyan.service.user.UserService;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2016/5/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User get(String name) throws Exception {
        return userDao.get(name);
    }

    @Override
    public int add(User user) throws Exception {
        user.setOid(UUID.randomUUID().toString());
        Date time = Calendar.getInstance().getTime();
        String timeStr = DateUtil.df6.format(time);
        user.setCreateTime(timeStr);
        user.setUpdateTime(timeStr);
        return userDao.insert(user);
    }

    @Override
    public int update(User user) throws Exception {
        return userDao.update(user);
    }

    @Override
    public int delete(String oid) throws Exception {
        return userDao.delete(oid);
    }
}
