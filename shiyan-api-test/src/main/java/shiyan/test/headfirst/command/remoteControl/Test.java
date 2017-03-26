package shiyan.test.headfirst.command.remoteControl;

import shiyan.test.headfirst.command.remoteControl.command.GarageDoorOpenCommand;
import shiyan.test.headfirst.command.remoteControl.command.LightOnCommand;
import shiyan.test.headfirst.command.remoteControl.po.AisleLight;
import shiyan.test.headfirst.command.remoteControl.po.GarageDoor;

/**
 * Created by Administrator on 2016/11/16.
 */
public class Test {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new AisleLight());
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressSlot();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.pressSlot();
    }
}
