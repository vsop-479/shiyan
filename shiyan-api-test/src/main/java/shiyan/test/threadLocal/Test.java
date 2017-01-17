package shiyan.test.threadLocal;

import com.sun.xml.internal.bind.v2.model.runtime.RuntimeNonElement;

import java.util.UUID;

/**
 * Created by Administrator on 2016/6/30.
 * 在当前线程活动周期内，保存线程局部变量的副本。
 */
public class Test {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            Thread t = new Thread(new R());
            t.start();
        }
    }
}

class R implements Runnable{

    @Override
    public void run() {
        String s = UUID.randomUUID().toString();
        System.out.println(Thread.currentThread().getName() + "--getOid().set--" + s);
        ThreadLocalVars.getOid().set(s);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--getOid().get--" + ThreadLocalVars.getOid().get());
    }
}