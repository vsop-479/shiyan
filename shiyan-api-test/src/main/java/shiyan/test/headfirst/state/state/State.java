package shiyan.test.headfirst.state.state;

/**
 * Created by Administrator on 2016/11/21.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

}
