package thinking.in.java.chapter19.demo;

/**
 * Created by Administrator on 2016/11/3.
 */
public class TrafficLight {
    Signal color = Signal.RED;
    public void change(){
        switch (color){
            case RED: color = Signal.GREEN;
                break;
            case GREEN: color = Signal.YELLOW;
                break;
            case YELLOW: color = Signal.RED;
                break;
        }
    }

    public String toString(){
        return "The traffic light is " + color;
    }

    public static void main(String[] args){
        TrafficLight t = new TrafficLight();
        for(int i = 0; i < 7; i++){
            System.out.println(t);
            t.change();
        }
    }
}

enum Signal{
    GREEN, YELLOW, RED
}
