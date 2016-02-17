package thinking.in.java.chapter8.p9_p12_p14;

import java.util.Random;

/**
 * Created by Administrator on 2016/2/16.
 */
public class RandomRodentGenerator {
    private Random random = new Random(47);
    public Rodent next(Shared shared){
        switch (random.nextInt(3)){
            default:
            case 0: return new Gerbil(shared);
            case 1: return new Hamster(shared);
            case 2: return new Mouse(shared);
        }
    }
}
