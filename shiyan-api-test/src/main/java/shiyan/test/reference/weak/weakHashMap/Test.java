package shiyan.test.reference.weak.weakHashMap;

import shiyan.test.reference.User;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * Created by zhouhui on 2017/3/26.
 */
public class Test {
    public static void main(String[] args){
        testWeakHashMap();
    }

    public static void testWeakHashMap(){
        WeakHashMap<Object, Object> weakHashMap = new WeakHashMap<>();
//        new User()并没有产生强引用，
        weakHashMap.put("userId", new User());
        weakHashMap.get("userId");
    }

    public static void testAll(){
        User softUser = new User();
        User weakUser = new User();
        User phantomUser = new User();

        softUser.setId("softUser");
        weakUser.setId("weakUser");
        phantomUser.setId("phantomUser");

//        此时，softUser有一个可达引用，和一个软引用
        SoftReference<User> userSoftReference = new SoftReference<>(softUser);
//        此时，softUser只有一个软引用，内存不够时才回收。
        softUser = null;
//        通过软引用访问softUser
        userSoftReference.get();

//        此时，weakUser有一个可达引用，和一个弱引用
        WeakReference<User> userWeakReference = new WeakReference<>(weakUser);
//        此时，weakUser只有一个弱，gc时必回收。
        weakUser = null;
//        通过弱引用访问weakUser
        userWeakReference.get();

    }
}
