package shiyan.test.headfirst.component_patterns.factory;

import shiyan.test.headfirst.component_patterns.duck.Quackable;

/**
 * Created by Administrator on 2016/11/23.
 */
public interface AbstractDuckFactory {
    public Quackable createMallardDuck();
    public Quackable createRedheadDuck();
    public Quackable createDuckCall();
    public Quackable createRubberDuck();
}
