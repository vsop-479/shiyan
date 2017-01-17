package shiyan.test.threadLocal;

/**
 * Created by Administrator on 2016/6/30.
 * 每一个线程都有一个ThreadLocalMap, 保存ThreadLocal对象到值得映射。
 * oid，name，description将存在每个线程的ThreadLocalMap中。
 */
public class ThreadLocalVars {
    private static final ThreadLocal<String> oid = new ThreadLocal<String>();

    public static ThreadLocal<String> getOid() {
        return oid;
    }

    private static final ThreadLocal<String> name = new ThreadLocal<String>();

    public static ThreadLocal<String> getName() {
        return name;
    }

    private static final ThreadLocal<String> description = new ThreadLocal<String>();

    public static ThreadLocal<String> getDescription() {
        return description;
    }
}
