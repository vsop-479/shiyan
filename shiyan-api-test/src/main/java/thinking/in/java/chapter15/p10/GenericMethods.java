package thinking.in.java.chapter15.p10;

/**
 * Created by Administrator on 2016/10/28.
 */
public class GenericMethods {
    public <T, B> void f(T t, B b, String g){

        System.out.println(t.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(g.getClass().getName());
    }

    public static void main(String[] args){

        GenericMethods gm = new GenericMethods();
        gm.f(1.1, 1.2F, "fd");
    }
}
