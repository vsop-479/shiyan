package shiyan.test.headfirst.component_patterns;

import shiyan.test.headfirst.component_patterns.duck.*;
import shiyan.test.headfirst.component_patterns.goose.Goose;

/**
 * Created by Administrator on 2016/11/22.
 */
public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulator();
    }

    public void simulator(){
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable rubberDuck = new RubberDuck();

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

    public void simulator(Quackable duck){
        duck.quack();
    }
}
