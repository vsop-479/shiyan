package shiyan.test.headfirst.command.remoteControl;

import shiyan.test.headfirst.command.remoteControl.command.Command;

/**
 * Created by Administrator on 2016/11/16.
 */
public class RemoteControl {
    private Command slot;
    public RemoteControl(){}

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void pressSlot(){
        slot.execute();
    }
}
