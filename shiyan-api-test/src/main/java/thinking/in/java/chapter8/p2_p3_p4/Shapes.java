package thinking.in.java.chapter8.p2_p3_p4;

/**
 * Created by Administrator on 2016/2/15.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++){
            s[i] = gen.next();
        }
        for(Shape shape : s){
            shape.draw();
            shape.f();
        }
        Oval oval = new Oval();
        oval.draw();
        oval.f();
    }
}

class Oval extends Shape{
    @Override
    public void draw(){
        System.out.println("Oval draw()");
    }
    @Override
    public void erase(){
        System.out.println("Oval erase()");
    }
    @Override
    public void f(){
        System.out.println("Oval f()");
    }
}
