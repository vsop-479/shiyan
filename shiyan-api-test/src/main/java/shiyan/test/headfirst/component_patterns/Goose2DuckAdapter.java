package shiyan.test.headfirst.component_patterns;

import shiyan.test.headfirst.component_patterns.duck.Quackable;
import shiyan.test.headfirst.component_patterns.goose.Goose;

/**
 * Created by Administrator on 2016/11/22.
 * 鹅的honk接口适配成鸭子的quack接口
 */
public class Goose2DuckAdapter implements Quackable {
    private Goose goose;
    public Goose2DuckAdapter(Goose goose){
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
