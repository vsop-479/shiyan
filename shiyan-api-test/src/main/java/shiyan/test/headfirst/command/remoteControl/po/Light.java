package shiyan.test.headfirst.command.remoteControl.po;

/**
 * Created by Administrator on 2016/11/16.
 */
public abstract class Light {
    protected String description = "unknown light";
    public abstract void on();
    public abstract void off();

    public String getDescription() {
        return description;
    }
}
