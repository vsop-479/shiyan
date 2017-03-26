package shiyan.test.headfirst.component_patterns;

import shiyan.test.headfirst.component_patterns.duck.*;
import shiyan.test.headfirst.component_patterns.factory.AbstractDuckFactory;
import shiyan.test.headfirst.component_patterns.factory.AbstractGooseFactory;
import shiyan.test.headfirst.component_patterns.factory.CountingDuckFactory;
import shiyan.test.headfirst.component_patterns.factory.GooseFactory;
import shiyan.test.headfirst.component_patterns.goose.Goose;
import shiyan.test.headfirst.component_patterns.object_component.Flock;
import shiyan.test.headfirst.component_patterns.observer.Quacklogist;

/**
 * Created by Administrator on 2016/11/22.
 */
public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulator();
        simulator.simulatorWithFactory(new CountingDuckFactory(), new GooseFactory());
        simulator.simulatorWithComponent(new CountingDuckFactory());
    }

    public void simulator(){
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable rubberDuck = new RubberDuck();
        //注册观察者
        duckCall.registry(new Quacklogist());
        mallardDuck.registry(new Quacklogist());
        redheadDuck.registry(new Quacklogist());
        rubberDuck.registry(new Quacklogist());

//        策略
//        装饰QuackCounter
        simulator(new QuackCounter(duckCall));
        simulator(new QuackCounter(mallardDuck));
        simulator(new QuackCounter(redheadDuck));
        simulator(new QuackCounter(rubberDuck));

//        适配
        Goose2DuckAdapter goose2DuckAdapter = new Goose2DuckAdapter(new Goose());
        simulator(new QuackCounter(goose2DuckAdapter));

        System.out.println("quacks: " + QuackCounter.getCount());
    }

//    抽象工厂
    public void simulatorWithFactory(AbstractDuckFactory factory, AbstractGooseFactory gooseFactory){
        simulator(factory.createMallardDuck());
        simulator(factory.createRedheadDuck());
        simulator(factory.createRubberDuck());
        simulator(factory.createDuckCall());

        simulator(gooseFactory.createGAdaptor2Q());

        System.out.println("simulatorWithFactory quacks: " + QuackCounter.getCount());
    }

//    对象组合，使对象集合像单个对象一样使用
    public void simulatorWithComponent(AbstractDuckFactory factory){
        Flock flock = new Flock();
        flock.add(factory.createMallardDuck());
        flock.add(factory.createRedheadDuck());
        flock.add(factory.createRubberDuck());
        flock.add(factory.createDuckCall());
//注册观察者
        flock.registry(new Quacklogist());
//        使对象集合像单个对象一样使用
        flock.quack();

        System.out.println("simulatorWithComponent quacks: " + QuackCounter.getCount());
    }
    public void simulator(Quackable duck){
        duck.quack();
    }
}
