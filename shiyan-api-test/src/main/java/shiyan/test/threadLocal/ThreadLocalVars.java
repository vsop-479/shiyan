package shiyan.test.threadLocal;

/**
 * Created by Administrator on 2016/6/30.
 */
public class ThreadLocalVars {
    private static final ThreadLocal<String> oid = new ThreadLocal<String>();

    public static ThreadLocal<String> getOid() {
        return oid;
    }
}
