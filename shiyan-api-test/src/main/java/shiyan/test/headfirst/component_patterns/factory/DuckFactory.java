package shiyan.test.headfirst.component_patterns.factory;

import shiyan.test.headfirst.component_patterns.duck.*;

/**
 * Created by Administrator on 2016/11/23.
 */
public class DuckFactory implements AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
