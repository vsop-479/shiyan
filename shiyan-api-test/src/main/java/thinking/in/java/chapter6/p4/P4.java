package thinking.in.java.chapter6.p4;

import thinking.in.java.chapter6.p4.jk.SuperP4;

/**
 * Created by Administrator on 2015/12/8.
 */
public class P4 extends SuperP4 {
    public static void main(String[] args){
        P4 p4 = new P4();
        System.out.print(p4.pro);//受保护，既有包内访问权限，又有包外继承访问权限
    }
}

class A{
    void f(){
        SuperP4 superP4 = new SuperP4();
//        p4.pro//在包外，没有继承，无法访问受保护属性
    }
}