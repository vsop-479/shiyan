package shiyan.test.headfirst.component_patterns.duck;

import shiyan.test.headfirst.component_patterns.observer.Observer;
import shiyan.test.headfirst.component_patterns.observer.QuackObservable;
import shiyan.test.headfirst.component_patterns.observer.QuackObservableImpl;

/**
 * Created by Administrator on 2016/11/22.
 */
public class DuckCall implements Quackable {
    QuackObservable quackObservable;
    public DuckCall(){
        quackObservable = new QuackObservableImpl(this);
    }
    @Override
    public void quack() {
        System.out.println("Kwak");
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
