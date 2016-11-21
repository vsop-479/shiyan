package shiyan.test.headfirst.state.state;

import shiyan.test.headfirst.state.GumballMachine;

/**
 * Created by Administrator on 2016/11/21.
 */
public class NoQuarterState implements State{
    private GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("成功收钱");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
