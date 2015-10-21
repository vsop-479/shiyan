package thinking.in.java.chapter4.p7;

/**
 * Created by Administrator on 2015/10/21.
 */
public class Practice7 {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i == 100){
                return;//退出整个方法
//                break;
            }
            System.out.println(i);
        }

        int i = 1;
        while(i <= 100){
            if(i == 100){
                break;
            }
            System.out.println(i);
            i++;
        }
        i = 1;
        do{
            if(i == 100){
                break;
            }
            System.out.println(i);
            i++;
        }while(i <= 100);
    }
}
