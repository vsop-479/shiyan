package shiyan.test.headfirst.state.state;

import shiyan.test.headfirst.state.GumballMachine;

/**
 * Created by Administrator on 2016/11/21.
 */
public class HasQuarterState implements State{
    private GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经有25分钱");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("收好你的钱");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("开始转动，准备放糖");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("请转动曲柄");
    }
}
