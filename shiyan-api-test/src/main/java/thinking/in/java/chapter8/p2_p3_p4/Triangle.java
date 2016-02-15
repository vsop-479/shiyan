package thinking.in.java.chapter8.p2_p3_p4;

/**
 * Created by Administrator on 2016/2/15.
 */
public class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Triangle draw()");
    }
    @Override
    public void erase(){
        System.out.println("Triangle erase()");
    }
    @Override
    public void f(){
        System.out.println("Circle f()");
    }
}
