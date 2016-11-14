package shiyan.test.headfirst.decorator.cafee;

import shiyan.test.headfirst.decorator.cafee.decorator.Mocha;

/**
 * Created by Administrator on 2016/11/14.
 */
public class Test {
    public static void main(String[] args){
//        1:Espresso
        Beverage beverage = new Espresso();
        beverage.setSize("grande");
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
//        2：Espresso + Mocha
//        Mocha本身也是beverage，可以继续被包装
        Beverage beverage2 = new Espresso();
        beverage2.setSize("venti");
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

//        3:HouseBlend+Mocha+Mocha
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize("tall");
        beverage3 = new Mocha(beverage3);
        //        返回的Mocha本身也是beverage，可以继续被包装
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());

        System.out.println(.690 + .10);


    }
}
