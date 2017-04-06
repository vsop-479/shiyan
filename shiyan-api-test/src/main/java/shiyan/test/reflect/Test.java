package shiyan.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/4/1.
 */
public class Test {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        clazz();
    }

    public static void constructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Target> declaredConstructor = Target.class.getDeclaredConstructor();
        Target target = declaredConstructor.newInstance();
        System.out.println();
    }

    public static void clazz() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Target> declaredConstructor = Target.class.getDeclaredConstructor();
        Target target = Target.class.newInstance();
        System.out.println();
    }
}