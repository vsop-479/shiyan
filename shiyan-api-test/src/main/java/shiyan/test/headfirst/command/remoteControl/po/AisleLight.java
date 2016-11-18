package shiyan.test.headfirst.command.remoteControl.po;

/**
 * Created by Administrator on 2016/11/16.
 */
public class AisleLight extends Light {
    public AisleLight(){
        description = "AisleLight";
    }
    @Override
    public void on() {
        System.out.println("AisleLight on");
    }

    @Override
    public void off() {
        System.out.println("AisleLight off");
    }
}
