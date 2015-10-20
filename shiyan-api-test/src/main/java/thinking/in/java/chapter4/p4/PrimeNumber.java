package thinking.in.java.chapter4.p4;

/**
 * Created by Administrator on 2015/10/20.
 * 求素数(质数)
 */
public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(1);
        for(int i = 2; i <= 1000; i++){
            boolean flag = true;
            for(int m = 2; m < i; m++){
                if(i % m == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
