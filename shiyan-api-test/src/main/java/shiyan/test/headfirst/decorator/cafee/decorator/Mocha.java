package shiyan.test.headfirst.decorator.cafee.decorator;

import shiyan.test.headfirst.decorator.cafee.Beverage;

/**
 * Created by Administrator on 2016/11/14.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
        this.size = beverage.getSize();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost;
        if(size.toLowerCase().equals("tall")){
            cost = .10;
        }else if(size.toLowerCase().equals("grande")){
            cost = .15;;
        }else{
            cost = .20;
        }
        return cost + beverage.cost();
    }
}
