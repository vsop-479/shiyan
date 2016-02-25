package thinking.in.java.chapter9.code317;

import thinking.in.java.chapter8.p6_p7_p8.Note;

/**
 * Created by Administrator on 2016/2/24.
 * 结果：
 * Wind.play()MIDDLE_C
 * Percussion.play()MIDDLE_C
 * Stringed.play()MIDDLE_C
 * Brass.play()MIDDLE_C
 * Woodwind.play()MIDDLE_C
 */
interface Instrument {
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

class Percussion implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }
    public String toString(){
        return "Percussion";
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }
    public String toString(){
        return "Stringed";
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind{
    public String toString(){
        return "Brass";
    }
}

class Woodwind extends Wind{
    public String toString(){
        return "Woodwind";
    }
}

public class Music5{
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e){
        for (Instrument i : e){
            tune(i);
        }
    }

    public static void main(String[] args){
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}