package thinking.in.java.chapter4.p3;

import java.util.Random;

/**
 * Created by Administrator on 2015/10/20.
 * 无限循环随机数，并让当前随机数与下个随机数比较大小
 */
public class Practice3 {
    public static void main(String[] args){
        Random random = new Random();
        int r = random.nextInt(100);
        while(true){
            int next = random.nextInt(100);
            if(r > next){
                System.out.println(r + "大于" + next);
            }else if(r < next){
                System.out.println(r + "小于" + next);
            }else{
                System.out.println(r + "等于" + next);
            }
            r = next;
        }
    }
}
