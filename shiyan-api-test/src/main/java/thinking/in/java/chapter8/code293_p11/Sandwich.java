package thinking.in.java.chapter8.code293_p11;

/**
 * Created by Administrator on 2016/2/16.
 * 结果：
 * Meal()（构造之前，先构造基类）
 * Lunch()（构造之前，先构造基类）
 * PortableLunch()（构造之前，先构造基类）
 * Bread()（构造时，先初始化成员变量）
 * Cheese()（构造时，先初始化成员变量）
 * Lettuce()（构造时，先初始化成员变量）
 * Sandwich()（构造）
 */
class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}
class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}
class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}
class Pickle{
    Pickle(){System.out.println("Pickle()");}

}
class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}
public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich(){
        System.out.println("Sandwich()");
    }
    public static void main(String[] args){
        new Sandwich();
    }
}