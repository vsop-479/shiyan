package shiyan.test.reference.strong;

import shiyan.test.reference.User;

/**
 * Created by zhouhui on 2017/3/26.
 */
public class Test {
    public void f(){
//        此时，产生user这个强引用
        User user = new User();
    }
}
