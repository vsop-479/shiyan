package shiyan.test.headfirst.adapter.duck;

/**
 * Created by Administrator on 2016/11/17.
 * 将鸭子适配成火鸡
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
