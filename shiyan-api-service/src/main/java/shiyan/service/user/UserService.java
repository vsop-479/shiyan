package shiyan.service.user;

import shiyan.domain.user.User;

/**
 * Created by Administrator on 2016/5/13.
 */
public interface UserService {
    public User get(String name)throws Exception;
    public int add(User user)throws Exception;
    public int update(User user)throws Exception;
    public int delete(String oid)throws Exception;
}
