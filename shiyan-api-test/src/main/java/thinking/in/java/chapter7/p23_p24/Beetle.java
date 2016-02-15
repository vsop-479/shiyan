package thinking.in.java.chapter7.p23_p24;

/**
 * Created by Administrator on 2016/2/15.
 * 结果：
 * static Insect.x1 initialized(加载Beetle时，先加载基类Insect，顺序初始化static变量)
 * static Beetle.x2 initialized(加载Beetle，顺序初始化static变量)
 * Beetle constructor(执行main)
 * i = 9, j = 0(构造Beetle之前，先构造基类Insect）
 * Beetle.k initialized（构造Beetle时，先初始化成员变量）
 * k = 47(构造Beetle)
 * j = 39(构造Beetle)
 */
public class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");
    public static void main(String[] args){
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}

class Insect{

    private int i = 9;
    protected int j;

    Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}
