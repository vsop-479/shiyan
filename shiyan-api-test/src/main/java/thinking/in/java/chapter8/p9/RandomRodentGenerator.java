package thinking.in.java.chapter8.p9;

import java.util.Random;

/**
 * Created by Administrator on 2016/2/16.
 */
public class RandomRodentGenerator {
    private Random random = new Random(47);
    public Rodent next(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Gerbil();
            case 1: return new Hamster();
            case 2: return new Mouse();
        }
    }
}
