package shiyan.test.headfirst.component_patterns.factory;

import shiyan.test.headfirst.component_patterns.duck.Quackable;
import shiyan.test.headfirst.component_patterns.goose.Goose;

/**
 * Created by Administrator on 2016/11/23.
 */
public interface AbstractGooseFactory {
    public Goose createGoose();
    public Quackable createGAdaptor2Q();
}
