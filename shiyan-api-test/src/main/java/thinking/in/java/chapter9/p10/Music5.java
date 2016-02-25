package thinking.in.java.chapter9.p10;

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
    void adjust();
}
interface Playable{
    void play(Note n);
}

class Wind implements Instrument, Playable{

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

class Percussion implements Instrument, Playable {

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

class Stringed implements Instrument, Playable {

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

class Brass extends Wind {
    public String toString(){
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString(){
        return "Woodwind";
    }
}

public class Music5{
    static void tune(Playable p){
        p.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e){
        for (Playable p : e){
            tune(p);
        }
    }

    public static void main(String[] args){
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}