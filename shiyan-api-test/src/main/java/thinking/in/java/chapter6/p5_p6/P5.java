package thinking.in.java.chapter6.p5_p6;

/**
 * Created by Administrator on 2015/12/8.
 */
public class P5 {
    public static void main(String[] args){
        Test test = new Test();
        //test.pri;'pri' has private access
//        test.pri();'pri()' has private access
        String def = test.def;
        test.def();

    }
}

class Test{
    private String pri;
    String def;
    protected String pro;
    public String pub;

    private void pri(){}

    void def(){}

    protected void pro(){}

    public void pub(){}
}