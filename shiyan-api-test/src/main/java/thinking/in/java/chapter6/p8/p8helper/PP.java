package thinking.in.java.chapter6.p8.p8helper;

/**
 * Created by Administrator on 2015/12/8.
 */
public class PP {
    public static void main(String[] args){
        //不在同一个进程，无法将Connection资源放到P8中
        ConnectionManager.putConnection(new Connection("des-x"));
    }
}
