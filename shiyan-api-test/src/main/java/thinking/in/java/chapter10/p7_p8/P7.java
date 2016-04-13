package thinking.in.java.chapter10.p7_p8;

/**
 * Created by Administrator on 2016/4/13.
 */
public class P7 {
    private String a;
    private void f(){
        System.out.println(a);
    }

    class InnerP7{
        private String s;
        private void g(){
            a = "dd";
            f();
        }
    }
    public void h(){
       InnerP7 innerP7 = this.new InnerP7();
       //        可以访问内部类的私有元素，private void g
       innerP7.g();
    }

    public static void main(String[] args){

        new P7().h();
    }
}
