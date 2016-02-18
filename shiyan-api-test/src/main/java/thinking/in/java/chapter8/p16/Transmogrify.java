package thinking.in.java.chapter8.p16;

/**
 * Created by Administrator on 2016/2/18.
 * 结果：
 * HappyActor
 * SadActor
 */
class Actor{
    public void act(){}
}
class HappyActor extends Actor{
    public void act(){
        System.out.println("HappyActor");
    }
}
class SadActor extends Actor{
    public void act(){
        System.out.println("SadActor");
    }
}
class Stage{
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
public class Transmogrify {
    public static void main(String[] args){
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
