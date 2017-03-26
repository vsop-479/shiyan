package shiyan.test.classLoader;

/**
 * Created by Administrator on 2016/3/28.
 */
public class Test {
    public static void main(String[] args){
        MyClassLoader myClassLoader = new MyClassLoader();
        try {
            Class<?> myClass = myClassLoader.loadClass("myClass");
            try {
                Object o = myClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}