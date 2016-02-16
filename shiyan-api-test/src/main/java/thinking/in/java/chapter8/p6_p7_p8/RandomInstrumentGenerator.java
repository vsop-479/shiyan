package thinking.in.java.chapter8.p6_p7_p8;

import java.util.Random;

/**
 * Created by Administrator on 2016/2/16.
 */
public class RandomInstrumentGenerator {
    private Random rand = new Random(47);
    public Instrument next(){
        switch (rand.nextInt(5)){
            default:
            case 0: return new Brass();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Wind();
            case 4: return new Woodwind();
        }
    }
}
