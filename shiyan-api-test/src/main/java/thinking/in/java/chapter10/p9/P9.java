package thinking.in.java.chapter10.p9;

/**
 * Created by Administrator on 2016/4/13.
 */
public class P9 {
    A d(){
        class DInner implements A{

            @Override
            public void a() {

            }
        }
        return new DInner();
    }

}

interface A{
    void a();
}