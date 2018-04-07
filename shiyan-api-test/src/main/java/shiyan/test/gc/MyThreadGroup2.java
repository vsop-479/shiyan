package shiyan.test.gc;

/**
 * Created by Administrator on 2017/5/23.
 */
public class MyThreadGroup2 extends ThreadGroup {
    /**
     * Constructs a new thread group. The parent of this new group is
     * the thread group of the currently running thread.
     * <p>
     * The <code>checkAccess</code> method of the parent thread group is
     * called with no arguments; this may result in a security exception.
     *
     * @param name the name of the new thread group.
     * @throws SecurityException if the current thread cannot create a
     *                                     thread in the specified thread group.
     * @see ThreadGroup#checkAccess()
     * @since JDK1.0
     */
    public MyThreadGroup2(String name) {
        super(name);
    }
}
