package shiyan.test.headfirst.component_patterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/11/23.
 */
public class QuackObservableImpl implements QuackObservable {
    List<Observer> obs = new ArrayList<>();
    QuackObservable duck;
    public QuackObservableImpl(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registry(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = obs.iterator();
        while (iterator.hasNext()){
            iterator.next().update(duck);
        }
    }
}
