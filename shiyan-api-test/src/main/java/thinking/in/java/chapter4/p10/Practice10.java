package thinking.in.java.chapter4.p10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouhui on 2015/11/1.
 */
public class Practice10 {
    /**
     * 将数字i的各位数字按数组返回
     * @param i
     * @return
     */
    public static Integer[] getArray(int i){
        List<Integer> list = new ArrayList<Integer>();
        Integer b = 0;
        String s = String.valueOf(i);
        for(int k = 0; k < s.length(); k++){
            Integer integer = Integer.valueOf(String.valueOf(s.charAt(k)));
            list.add(integer);
        }
        return list.toArray(new Integer[0]);
    }

    /**
     * 返回m * 10 + n
     * @param m
     * @param n
     * @return
     */
    public static int getMulti10(int m, int n){
        return m * 10 + n;
    }

    /**
     * 吸血鬼数判断
     * @param i
     * @return
     */
    public static boolean isVampire(int i){
        if(i % 100 == 0){
            return false;
        }
        Integer[] array = getArray(i);
        //0,1;2,3
        if(i == getMulti10(array[0] , array[1]) * getMulti10(array[2] , array[3])){
            System.out.println(i + "==" + array[0] + array[1] + " * " + array[2] + array[3]);
            return true;
        }
        if(i == getMulti10(array[0] , array[1]) * getMulti10(array[3] , array[2])){
            System.out.println(i + "==" + array[0] + array[1] + " * " + array[3] + array[2]);
            return true;
        }
        if(i == getMulti10(array[1] , array[0]) * getMulti10(array[2] , array[3])){
            System.out.println(i + "==" + array[1] + array[0] + " * " + array[2] + array[3]);
            return true;
        }
        if(i == getMulti10(array[1] , array[0]) * getMulti10(array[3] , array[2])){
            System.out.println(i + "==" + array[1] + array[0] + " * " + array[3] + array[2]);
            return true;
        }
        //0,2;1,3
        if(i == getMulti10(array[0] , array[2]) * getMulti10(array[1] , array[3])){
            System.out.println(i + "==" + array[0] + array[2] + " * " + array[1] + array[3]);
            return true;
        }
        if(i == getMulti10(array[0] , array[2]) * getMulti10(array[3] , array[1])){
            System.out.println(i + "==" + array[0] + array[2] + " * " + array[3] + array[1]);
            return true;
        }
        if(i == getMulti10(array[2] , array[0]) * getMulti10(array[1] , array[3])){
            System.out.println(i + "==" + array[2] + array[0] + " * " + array[1] + array[3]);
            return true;
        }
        if(i == getMulti10(array[2] , array[0]) * getMulti10(array[3] , array[1])){
            System.out.println(i + "==" + array[2] + array[0] + " * " + array[3] + array[1]);
            return true;
        }
        //0,3;1,2
        if(i == getMulti10(array[0] , array[3]) * getMulti10(array[1] , array[2])){
            System.out.println(i + "==" + array[0] + array[3] + " * " + array[1] + array[2]);
            return true;
        }
        if(i == getMulti10(array[0] , array[3]) * getMulti10(array[2] , array[1])){
            System.out.println(i + "==" + array[0] + array[3] + " * " + array[2] + array[1]);
            return true;
        }
        if(i == getMulti10(array[3] , array[0]) * getMulti10(array[1] , array[2])){
            System.out.println(i + "==" + array[3] + array[0] + " * " + array[1] + array[2]);
            return true;
        }
        if(i == getMulti10(array[3] , array[0]) * getMulti10(array[2] , array[1])){
            System.out.println(i + "==" + array[3] + array[0] + " * " + array[2] + array[1]);
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        for(int i = 1000; i <= 9999; i++){
            if(isVampire(i)){
                System.out.println(i);
            }
        }
    }
}
