package shiyan.test.headfirst.state.state;

import shiyan.test.headfirst.state.GumballMachine;

/**
 * Created by Administrator on 2016/11/21.
 */
public class SoldState implements State{
    private GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        System.out.println("发放糖果");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
