package thinking.in.java.chapter15.demo;

/**
 * Created by Administrator on 2016/10/28.
 */
public class GenericMethods {
//    这一写法，必须在方法<T> 定义。
    public <T> void f(T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args){

        GenericMethods gm = new GenericMethods();
        byte b = 'c';
//      byte和Byte的自动打包，拆包
        gm.f(b);
//      char和Character的自动打包，拆包
        gm.f('c');
        short s = 1;
        gm.f(s);
//        int和Integer的自动打包，拆包
        gm.f(1);
        long l = 1;
        gm.f(l);
        //默认d，f需要显示的指出
        gm.f(1.1);
        gm.f(1.2F);
        gm.f(false);
        gm.f("dsd");
        gm.f(gm);
    }
}
