package shiyan.test.headfirst.decorator.cafee;

/**
 * Created by Administrator on 2016/11/14.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        if(size.toLowerCase().equals("tall")){
            return .69;
        }else if(size.toLowerCase().equals("grande")){
            return .89;
        }else{
            return .99;
        }
    }
}
