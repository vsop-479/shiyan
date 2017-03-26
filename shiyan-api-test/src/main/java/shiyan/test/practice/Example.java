package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 */
public class Example {
    String str = new String("good");
    char[] f = {'a', 'b', 'c'};
    public static void main(String[] args){
        Example e = new Example();
        e.change(e.str, e.f);
        System.out.print(e.str + " and ");
        System.out.print(e.f);


    }

//  java中都是地址副本传递，不能改变地址，可改变地址指向的值。而String的不可修改行，导致必须产生新的地址。
//  同为传递地址，但str = "test ok"产生新的地址；
//    而chars[0] = 'g';直接在改变地址指向的值。
    public void change(String str, char[] chars){
        str = "test ok";
        chars[0] = 'g';
//        新的地址，但main中还是只能看见旧的地址。
        chars = new char[3];
        chars[0] = 'q';
        chars[1] = 'w';
        chars[2] = 'e';
    }
}
