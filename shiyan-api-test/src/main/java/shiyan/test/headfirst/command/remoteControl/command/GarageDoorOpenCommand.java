package shiyan.test.headfirst.command.remoteControl.command;

import shiyan.test.headfirst.command.remoteControl.po.GarageDoor;

/**
 * Created by Administrator on 2016/11/16.
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }
}
