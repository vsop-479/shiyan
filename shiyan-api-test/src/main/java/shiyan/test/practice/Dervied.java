package shiyan.test.practice;

/**
 * 父类的构造方法中调用了被子类重写的方法，
 * 子类构造方法执行时，super()调用父类构造时，
 * 因运行时类型是子类，会执行子类重写的方法。
 * Created by Administrator on 2016/11/8.
 * Dervied tell name: null
    Dervied print name: null
    Dervied tell name: dervied
    Dervied print name: dervied
 * 1调用父类的方法已经被子类重写。
 * 2子类的name还没有初始化
 */
class Base {
    private String name = "base";
    public Base() {
        tellName();
        printName();
//      构造方法可以调用静态和final的方法
        f();
    }

    public void tellName() {
        System.out.println("Base tell name: " + name);
    }

    public void printName() {
        System.out.println("Base print name: " + name);
    }

    public static void f(){
        System.out.println("Base f(): ");
    }
}
public class Dervied extends Base{
    private String name = "dervied";

    public Dervied() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Dervied tell name: " + name);
    }

    public void printName() {
        System.out.println("Dervied print name: " + name);
    }

    public static void f(){
        System.out.println("Dervied f(): ");
    }
    public static void main(String[] args){

        new Dervied();
    }

}