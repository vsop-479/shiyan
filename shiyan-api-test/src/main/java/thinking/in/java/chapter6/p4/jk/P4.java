package thinking.in.java.chapter6.p4.jk;

/**
 * Created by Administrator on 2015/12/8.
 */
public class P4 {
    public static void main(String[] args){
        SuperP4 superP4 = new SuperP4();
        System.out.print(superP4.def);//默认，具有包内访问权限
        System.out.print(superP4.pro);//受保护，既有包内访问权限，又有包外继承访问权限
    }
}
