package shiyan.test.headfirst.component_patterns.factory;

import shiyan.test.headfirst.component_patterns.Goose2DuckAdapter;
import shiyan.test.headfirst.component_patterns.duck.QuackCounter;
import shiyan.test.headfirst.component_patterns.duck.Quackable;
import shiyan.test.headfirst.component_patterns.goose.Goose;

/**
 * Created by Administrator on 2016/11/23.
 */
public class GooseFactory implements AbstractGooseFactory {
    @Override
    public Goose createGoose() {
        return new Goose();
    }

    @Override
    public Quackable createGAdaptor2Q() {
//        对鹅适配+装饰
        return new QuackCounter(new Goose2DuckAdapter(new Goose()));
    }
}
