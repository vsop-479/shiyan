package thinking.in.java.chapter8.p9;

/**
 * Created by Administrator on 2016/2/16.
 */
public class RodentTest {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[9];
        for(int i = 0; i < rodents.length; i++){
            rodents[i] = gen.next();
        }
        for(Rodent r : rodents){
            r.f();
        }
    }
}
