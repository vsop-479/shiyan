package shiyan.test.examination.pattern;

/**
 * Created by Administrator on 2017/1/12.
 */
public class Test {
    public static void main(String[] args){
        test();
    }

    /**
     * 测试数量词*的零次和多次是否包括一次
     * 当然包括
     */
    public static void test(){
        System.out.println("a".matches("a*"));
    }
}
