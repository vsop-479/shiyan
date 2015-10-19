package thinking.in.java.chapter2.p9;

/**
 * Created by Administrator on 2015/10/19.
 */
public class Practice9 {
//    static boolean b;
//    static char c;
//    static byte b1;
//    static short s;
//    static int i;
//    static long l;
//    static float f;
//    static double d;
    public static void ff(){

    }
    public static void main(String[] args){
        boolean b = false;
        Boolean B = new Boolean(b);
        B = b;
        b = B;
        System.out.println(b);
        char c = 'a';//2byte
        Character C = new Character(c);
        C = c;
        c = C;
        System.out.println(c);
        byte b1 = 123;//1byte
        Byte B1 = new Byte(b1);
        B1 = b1;
        b1 = B1;
        System.out.println(b1);
        short s = 12345;//2byte
        Short S = new Short(s);
        S = s;
        s = S;
        System.out.println(s);
        int i = 1234567890;//4byte
        Integer I = new Integer(i);
        I = i;
        i = I;
        System.out.println(i);
        long l = 12345678909l;//8byte
        Long L = new Long(l);
        L = l;
        l = L;
        System.out.println(l);
        float f = 1.1f;//4byte
        Float F = new Float(f);
        F = f;
        f = F;
        System.out.println(f);
        double d = 1.1;//8byte
        Double D = new Double(d);
        D = d;
        d = D;
        System.out.println(d);
//        void v;
    }
}
