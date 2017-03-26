package shiyan.test.headfirst.command.remoteControl.po;

/**
 * Created by Administrator on 2016/11/16.
 */
public class GarageDoor {
    public void up(){
        System.out.println("GarageDoor is up");
    }

    public void down(){
        System.out.println("GarageDoor is down");
    }

    public void stop(){
        System.out.println("GarageDoor is stop");
    }

    public void lightOn(){
        System.out.println("GarageDoor is lightOn");
    }

    public void lightOff(){
        System.out.println("GarageDoor is lightOff");
    }
}
