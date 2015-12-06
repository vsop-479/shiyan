package thinking.in.java.chapter5.p5;

/**
 * Created by zhouhui on 2015/11/8.
 */
public class D {
    public void bark(byte b){
        System.out.println("barking! barking!byte: " + b + " 1 byte");
    }
    public void bark(char c){
        System.out.println("barking! barking!char: " + c + " 2 byte");
    }
    public void bark(short s){
        System.out.println("barking! barking!short: " + s + " 2 byte");
    }
    public void bark(int i){
        System.out.println("barking! barking!int: " + i + " 4 byte");
    }
    public void bark(long l){
        System.out.println("howling! howling!long: " + l + " 8 byte");
    }
    public void bark(boolean b){
        System.out.println("barking! barking!boolean: " + b + " - byte");
    }
    public void bark(float f){
        System.out.println("barking! barking!float: " + f + " 4 byte");
    }
    public void bark(double d){
        System.out.println("barking! barking!double: " + d + " 8 byte");
    }
    //    public void bark(void v){
//        System.out.println("barking! barking!void: " + v + " - byte");
//    }
    public static void main(String[] args){
        D d = new D();
        short s = 2;
        int i = 2;
        long l = 2l;
        d.bark(s);
        d.bark(i);
        d.bark(l);
    }
}
