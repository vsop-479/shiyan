package shiyan.test.headfirst.component_patterns.duck;

import shiyan.test.headfirst.component_patterns.observer.QuackObservable;

/**
 * Created by Administrator on 2016/11/22.
 */
public interface Quackable extends QuackObservable{
    public void quack();
}
