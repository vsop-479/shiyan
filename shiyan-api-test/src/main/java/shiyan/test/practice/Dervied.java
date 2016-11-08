package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 * Dervied tell name: null
    Dervied print name: null
    Dervied tell name: dervied
    Dervied print name: dervied
 * 1调用父类的方法已经被子类重写。
 * 2子类的name还没有初始化
 */
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

    public static void main(String[] args){

        new Dervied();
    }

}

class Base {

    private String name = "base";

    public Base() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Base tell name: " + name);
    }

    public void printName() {
        System.out.println("Base print name: " + name);
    }
}