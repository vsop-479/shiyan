package shiyan.test.headfirst.adapter.duck;

/**
 * Created by Administrator on 2016/11/17.
 */
public class WhiteDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("WhiteTuck quack");
    }

    @Override
    public void fly() {
        System.out.println("WhiteTuck fly");
    }
}
