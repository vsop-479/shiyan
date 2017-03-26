package shiyan.test.headfirst.state;

/**
 * Created by Administrator on 2016/11/21.
 */
public class Test {
    public static void main(String[] args){
        GumballMachine machine = new GumballMachine();
        machine.insertQuarter();
        machine.ejectQuarter();
        machine.insertQuarter();
        machine.turnCrank();
    }
}
