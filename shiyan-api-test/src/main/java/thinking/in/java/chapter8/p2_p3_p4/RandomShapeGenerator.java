package thinking.in.java.chapter8.p2_p3_p4;

import java.util.Random;

/**
 * Created by Administrator on 2016/2/15.
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

}
