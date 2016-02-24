package thinking.in.java.chapter9.code317;

import thinking.in.java.chapter8.p6_p7_p8.Note;

/**
 * Created by Administrator on 2016/2/24.
 */
public interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }
    public String toString(){
        return "Wind";
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}