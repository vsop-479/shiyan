package shiyan.test.headfirst.component_patterns.duck;

/**
 * Created by Administrator on 2016/11/22.
 * 装饰模式，为接口加入新的行为
 */
public class QuackCounter implements Quackable {
    private Quackable quackable;
//    类变量，不同的对象共同操作
    static int count = 0;
    public QuackCounter(Quackable quackable){
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
//        装饰模式，为接口加入新的行为
        count++;
    }

    public static int getCount(){
        return count;
    }

}
