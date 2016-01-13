package thinking.in.java.chapter7.p6;

/**
 * Created by Administrator on 2016/1/13.
 */
public class Chess extends BoardGame{
    Chess(){
        super(11);//在父类没有无参构造方法时，必须显示super指定参数调用
        //若有BoardGame(),则不必显示super指定参数调用。
        System.out.println("Chess");
    }
}

class Game{
    Game(int i){
        System.out.println("Game");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);//在父类没有无参构造方法时，必须显示super指定参数调用
        System.out.println("BoardGame");
    }
}