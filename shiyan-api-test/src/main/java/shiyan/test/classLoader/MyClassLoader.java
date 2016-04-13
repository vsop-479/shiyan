package shiyan.test.classLoader;

/**
 * Created by Administrator on 2016/3/28.
 */
public class MyClassLoader extends ClassLoader {

    public Class findClass(String name){
        byte[] bytes = loadClassData(name);
        return defineClass(name, bytes, 0, bytes.length);
    }

    //load the class data from the connection
    public byte[] loadClassData(String name){
        return null;
    }
}
