package shiyan.test.headfirst.adapter.duck;

/**
 * Created by Administrator on 2016/11/17.
 */
public class Test {
    public static void main(String[] args){
        DuckAdapter duckAdapter = new DuckAdapter(new WhiteDuck());
        duckAdapter.fly();
        duckAdapter.gobble();
    }
}
