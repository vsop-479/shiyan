package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 */
public class Test {
    private String a;
    public static String f(){
        String s;
        try{
//            "aa"一个地址
            s = "aa";
//            看到"aa"的地址，返回"aa"
            return s;
        }finally {
//            "bb"一个地址
            s = "bb";
        }
    }

//    引用传递，同一个引用修改值。
    public static void g(Test t){
        try{
            t.a = "aa";
            return;
        }finally {
            t.a = "bb";
        }
    }

    public static void main(String[] args){
        System.out.println(f());
        Test test = new Test();
        g(test);
        System.out.println(test.a);
    }
}
