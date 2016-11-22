package shiyan.test.headfirst.component_patterns.duck;

/**
 * Created by Administrator on 2016/11/22.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
