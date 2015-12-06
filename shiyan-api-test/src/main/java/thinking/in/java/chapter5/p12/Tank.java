package thinking.in.java.chapter5.p12;

/**
 * Created by zhouhui on 2015/12/6.
 */
public class Tank {
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public void charge(){
        setIsEmpty(false);
    }

    //对象被垃圾回收之前，调用此方法
    public void finalize(){
        if(isEmpty){
            System.out.println("对象已空，可以清除");
        }else{
            System.out.println("对象还未空，本不该清除");
        }
    }

    public static void main(String[] args){
        new Tank();
        System.gc();
        new Tank().charge();
        System.gc();
    }
}
