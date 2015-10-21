package thinking.in.java.chapter4.p8;

/**
 * Created by Administrator on 2015/10/21.
 */
public class Practice8 {
    static void f(int n){
        switch (n){
            case 1:
                System.out.println("case: 1");
                break;
            case 2:
                System.out.println("case: 2");
                break;
            case 3:
                System.out.println("case: 3");
                break;
            default:
                System.out.println("case: 0");
                break;
        }
    }

    public static void main(String[] args){
//        f(2);
        int n = 1;
        for(int i = 0; i < 5; i++){
            switch (n){
                case 1:
                    System.out.println("case: 1");
                    break;
                case 2:
                    System.out.println("case: 2");
                    break;
                case 3:
                    System.out.println("case: 3");
                    break;
            }
        }
    }
}
