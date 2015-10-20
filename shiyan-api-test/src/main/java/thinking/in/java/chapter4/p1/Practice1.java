package thinking.in.java.chapter4.p1;

/**
 * Created by Administrator on 2015/10/20.
 * 打印1到100
 */
public class Practice1 {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        int i = 1;
        while(i <= 100){
            System.out.println(i);
            i++;
        }
        i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 100);
    }
}
