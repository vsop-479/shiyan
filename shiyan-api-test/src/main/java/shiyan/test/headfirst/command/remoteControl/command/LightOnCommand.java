package shiyan.test.headfirst.command.remoteControl.command;

import shiyan.test.headfirst.command.remoteControl.po.Light;

/**
 * Created by Administrator on 2016/11/16.
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
