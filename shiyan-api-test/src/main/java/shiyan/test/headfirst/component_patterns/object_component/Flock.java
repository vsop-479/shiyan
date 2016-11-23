package shiyan.test.headfirst.component_patterns.object_component;

import shiyan.test.headfirst.component_patterns.duck.Quackable;
import shiyan.test.headfirst.component_patterns.observer.Observer;
import shiyan.test.headfirst.component_patterns.observer.QuackObservable;
import shiyan.test.headfirst.component_patterns.observer.QuackObservableImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/11/23.
 * 组合模式:
 * 使对象集合像一个对象一样被使用
 */
public class Flock implements Quackable{
    QuackObservable quackObservable;
    public List<Quackable> list = new ArrayList<>();

    public Flock(){
        quackObservable = new QuackObservableImpl(this);
    }

    public void add(Quackable quackable){
        list.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().quack();
        }
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
