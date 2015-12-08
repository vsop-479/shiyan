package thinking.in.java.chapter6.p8;

import thinking.in.java.chapter6.p8.p8helper.Connection;
import thinking.in.java.chapter6.p8.p8helper.ConnectionManager;

/**
 * Created by Administrator on 2015/12/8.
 */
public class P8 {
    public static void main(String[] args) throws InterruptedException {
        Connection connection = ConnectionManager.takeConnection();
        System.out.println(connection.des);
        Connection connection2 = ConnectionManager.takeConnection();
        System.out.println(connection2.des);
        Connection connection3 = ConnectionManager.takeConnection();
        System.out.println(connection3.des);
        Connection connection4 = ConnectionManager.takeConnection();
        System.out.println(connection4.des);
    }
}
