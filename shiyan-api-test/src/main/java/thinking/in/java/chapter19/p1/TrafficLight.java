package thinking.in.java.chapter19.p1;

import static thinking.in.java.chapter19.p1.Signal.*;

/**
 * Created by Administrator on 2016/11/3.
 * 因静态引入，可直接使用枚举的元素。
 * Signal.RED --> RED
 */
public class TrafficLight {
    Signal color = RED;
    public void change(){
        switch (color){
            case RED: color = GREEN;
                break;
            case GREEN: color = YELLOW;
                break;
            case YELLOW: color = RED;
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

//因为所有的枚举都已经继承java.lang.Enum类，所以，enum不能再继承其他类。
//但可以implements
enum Signal{
    GREEN, YELLOW, RED
}
