package shiyan.test.headfirst.state;

import shiyan.test.headfirst.state.state.*;

/**
 * Created by Administrator on 2016/11/21.
 */
public class GumballMachine {
    private State soldState;
    private State soldOutState;
    private State hasQuarterState;
    private State noQuarterState;
    private State state;

    public GumballMachine(){
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        state = noQuarterState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

//    摇动曲柄后自动发放糖果
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }
}
