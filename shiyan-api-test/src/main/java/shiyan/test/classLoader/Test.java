package shiyan.test.classLoader;

import java.net.URLClassLoader;

/**
 * Created by Administrator on 2016/3/28.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader loader = new URLClassLoader(null);
//        Class<?> aClass = loader.loadClass("");

        System.out.println(Test.class.getClassLoader());
//        Class.forName("shiyan.test.classLoader.Test", true, Test.class.getClassLoader().getParent());
        Class.forName("shiyan.test.classLoader.Test");
    }
}
