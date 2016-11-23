package shiyan.test.headfirst.component_patterns.observer;


/**
 * Created by Administrator on 2016/11/23.
 */
public interface QuackObservable {
    public void registry(Observer observer);
    public void notifyObservers();
}
