package thinking.in.java.chapter4.p9;

/**
 * Created by Administrator on 2015/10/21.
 * 获得斐波那契数列：
 * 1,1,2,3,5,8,13,21,34,55....
 */
public class Fibonacci {
    static int f(int i){
        if(i == 1 || i == 2){
            return 1;
        }else{
            return f(i - 1) + f(i - 2);
        }
    }

    static void print(int i){
    }
    public static void main(String[] args){
        System.out.println(f(8));
    }
}
