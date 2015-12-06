package thinking.in.java.chapter5.p13;

/**
 * Created by zhouhui on 2015/12/6.
 */
class Cup{
    Cup(int marker){
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static{
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}
public class ExplicitStatic {
    public static void main(String[] args){
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();

}

//输出结果
//分析：先执行static Cups cups1 = new Cups();由于static Cups要加载Cups；static Cup加载Cup
//Cup(1)
//Cup(2)
//Cups()
//Cups()
//Inside main()
//f(99)