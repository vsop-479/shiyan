package shiyan.test.headfirst.decorator.cafee;

/**
 * Created by Administrator on 2016/11/14.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        if(size.toLowerCase().equals("tall")){
            return 1.99;
        }else if(size.toLowerCase().equals("grande")){
            return 2.19;
        }else{
            return 2.29;
        }

    }
}
