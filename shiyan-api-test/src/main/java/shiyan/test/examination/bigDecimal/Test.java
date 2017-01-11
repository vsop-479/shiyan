package shiyan.test.examination.bigDecimal;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Test {
    public static void main(String[] args){
        bigDecimalEquals();
        floatTest();
    }

    /**
     * BigDecimal的compareTo和equals违背一致性。
     * 2.0和2.00
     * compareTo:0，所以基于排序的TreeSet中，只有一个对象
     * equals:false，所以基于hash和equals的HashSet中，有两个对象
     */
    public static void bigDecimalEquals(){
        BigDecimal bigDecimal1 = new BigDecimal("2.0");
        BigDecimal bigDecimal2 = new BigDecimal("2.00");
        System.out.println("compareTo:" + bigDecimal1.compareTo(bigDecimal2));
        System.out.println("equals:" + bigDecimal1.equals(bigDecimal2));
    }

    /**
     * float的compareTo和equals保持一致性。
     */
    public static void floatTest(){
        Float f1 = 1.0f;
        Float f2 = 1.00f;
        System.out.println("compareTo:" + f1.compareTo(f2));
        System.out.println("equals:" + f1.equals(f2));
    }
}
