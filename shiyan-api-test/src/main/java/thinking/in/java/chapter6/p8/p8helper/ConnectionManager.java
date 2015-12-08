package thinking.in.java.chapter6.p8.p8helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * Created by Administrator on 2015/12/8.
 */
public class ConnectionManager {
    private static List<Connection> cons;
    private static Semaphore semaphore;
    private static CountDownLatch countDownLatch;

    static{
        cons = new ArrayList<Connection>();
        cons.add(new Connection("des1"));
        cons.add(new Connection("des2"));
        cons.add(new Connection("des3"));
        semaphore = new Semaphore(cons.size());
        countDownLatch = new CountDownLatch(cons.size());
    }

    /**
     * 如果没有可用的Connection，将阻塞
     * @return
     * @throws InterruptedException
     */
    public static Connection takeConnection() throws InterruptedException {
        semaphore.acquire();
        return cons.remove(0);
    }

    public static void putConnection(Connection connection){
        cons.add(connection);
        semaphore.release();
    }
}
