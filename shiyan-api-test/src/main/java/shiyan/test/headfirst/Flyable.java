package shiyan.test.headfirst;

/**
 * Created by Administrator on 2016/11/10.
 * jdk8的接口default方法，解决了接口方法代码不可复用的为题。
 */
public interface Flyable {
    public default void fly(){
        System.out.println("default fly");
    }
}

//重写fly
class A implements Flyable{
    public void fly(){
        System.out.println("A fly");
    }
}

//使用default fly
class B implements Flyable{
}

class Test{
    void f(){
        B b = new B();
        b.fly();
    }

}