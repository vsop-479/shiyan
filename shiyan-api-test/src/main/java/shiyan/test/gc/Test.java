package shiyan.test.gc;

import shiyan.test.threadLocal.ThreadLocalVars;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/23.
 */
public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        Test t = new Test();
        for(int i = 0; i < 10; i++){
            sgc(i + "");
            t.gc();
        }
        System.gc();
        System.in.read();
    }
//ThreadGroup需要调用destroy才能被回收。
    public static void sgc(String i) throws InterruptedException {
        MyThreadGroup myThreadGroup = new MyThreadGroup("ds");
        myThreadGroup.destroy();
        MyThreadGroup2 myThreadGroup2 = new MyThreadGroup2("ds");
        A a = new A();
    }

    public void gc(){
        B b = new B();
    }
}

class A{}
class B{}
