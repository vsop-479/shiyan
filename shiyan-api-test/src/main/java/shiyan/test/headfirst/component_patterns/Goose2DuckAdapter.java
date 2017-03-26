package shiyan.test.headfirst.component_patterns;

import shiyan.test.headfirst.component_patterns.duck.Quackable;
import shiyan.test.headfirst.component_patterns.goose.Goose;
import shiyan.test.headfirst.component_patterns.observer.Observer;
import shiyan.test.headfirst.component_patterns.observer.QuackObservable;
import shiyan.test.headfirst.component_patterns.observer.QuackObservableImpl;

/**
 * Created by Administrator on 2016/11/22.
 * 鹅的honk接口适配成鸭子的quack接口
 */
public class Goose2DuckAdapter implements Quackable {
    QuackObservable quackObservable;
    private Goose goose;
    public Goose2DuckAdapter(Goose goose){
        this.goose = goose;
        quackObservable = new QuackObservableImpl(this);
    }
    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registry(Observer observer) {
        quackObservable.registry(observer);
    }

    @Override
    public void notifyObservers() {
        quackObservable.notifyObservers();
    }
}
