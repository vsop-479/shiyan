package thinking.in.java.chapter2.p10;

/**
 * Created by Administrator on 2015/10/19.
 */
public class Practice10 {
    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        for(String arg : args){
            System.out.println(arg);
        }
    }
}
