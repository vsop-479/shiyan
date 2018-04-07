package shiyan.test;


/**
 * Created by Administrator on 2015/9/17.
 */
public class SomeTest {
    public static void main(String[] args){
        testPP();
    }

//  Java编程思想：对于前缀递增后前缀递减，会执行运算，再生成值。
//  而对于后缀递增和后缀递减，会先生成值，再执行运算。
//  对于前缀形式，我们在执行完运算之后才得到值。
//  但对于后缀形式，则是在运算执行之前就得到值。
    public static void testPP(){
        int i = 1, j = 2;
        System.out.println(i++);
        System.out.println(++j);

        int count1 = 0;
        count1 = count1++;
        System.out.println(count1);
    }

    /**
     *         int i = 1;
     //        新加一个栈帧
     f(i);
     //        在自己的栈帧中i还是1
     System.out.println(i);
     * @param i
     */
    public static void f(int i){
        i = 7;
    }

}