package shiyan.test.headfirst.component_patterns.observer;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Quacklogist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quacklogist: " + quackObservable + " just quacked");
    }
}
