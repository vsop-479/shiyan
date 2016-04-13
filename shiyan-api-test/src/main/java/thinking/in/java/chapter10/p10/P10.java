package thinking.in.java.chapter10.p10;

/**
 * Created by Administrator on 2016/4/13.
 */
public class P10 {
    A d(boolean f){
        if(f){
            class DInner implements A {

                @Override
                public void a() {

                }
            }
            return new DInner();
        }
        return null;
    }

}

interface A{
    void a();
}