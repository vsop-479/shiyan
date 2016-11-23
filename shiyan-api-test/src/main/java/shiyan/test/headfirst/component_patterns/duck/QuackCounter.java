package shiyan.test.headfirst.component_patterns.duck;

import shiyan.test.headfirst.component_patterns.observer.Observer;
import shiyan.test.headfirst.component_patterns.observer.QuackObservable;
import shiyan.test.headfirst.component_patterns.observer.QuackObservableImpl;

/**
 * Created by Administrator on 2016/11/22.
 * 装饰模式，为接口加入新的行为
 */
public class QuackCounter implements Quackable {
    QuackObservable quackObservable;
    private Quackable quackable;
//    类变量，不同的对象共同操作
    static int count = 0;
    public QuackCounter(Quackable quackable){
        this.quackable = quackable;
        quackObservable = new QuackObservableImpl(quackable);
    }

    @Override
    public void quack() {
        quackable.quack();
//        装饰模式，为接口加入新的行为
        count++;
        notifyObservers();
    }

    public static int getCount(){
        return count;
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
