package thinking.in.java.chapter8.p9_p12_p14;

/**
 * Created by Administrator on 2016/2/16.
 */
public class RodentTest {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[9];
        Shared shared = new Shared();
        for(int i = 0; i < rodents.length; i++){
            rodents[i] = gen.next(shared);
        }
        for(Rodent r : rodents){
            r.f();
        }
        System.out.println(shared.getRefCount());
    }
}
