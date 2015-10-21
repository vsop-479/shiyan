package thinking.in.java.chapter4.p6;

/**
 * Created by Administrator on 2015/10/21.
 */
public class Practice6 {
    static int test(int testval, int target, int begin, int end){
        if(testval >= begin && testval <= end){
            return 2;
        }else if(testval > target){
            return 1;
        }else if(testval < target){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println(test(5, 10, 3, 7));
    }
}
