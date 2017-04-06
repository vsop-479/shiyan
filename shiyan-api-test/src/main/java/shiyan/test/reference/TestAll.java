package shiyan.test.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by zhouhui on 2017/3/26.
 * 强引用，软引用，弱引用，虚引用
 * 引用强度依次减弱，引用越弱，gc回收越容易。
 * 强引用：对象不可达（栈中的引用）回收。
 * 软引用：内存不足，有弱引用也回收。
 * 弱引用：只要gc就回收。
 * 虚引用：辅助finalize函数使用，不可达之后，利用虚引用访问，使用。
 */
public class TestAll {
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
