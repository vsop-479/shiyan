package thinking.in.java.chapter8.p6_p7_p8;

/**
 * Created by Administrator on 2016/2/15.
 */
public class Music3 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }
    public static void main(String[] args){
//        Instrument[] orchestra = {
//                new Wind(),
//                new Percussion(),
//                new Stringed(),
//                new Brass(),
//                new Woodwind()
//        };
//        tuneAll(orchestra);
        Instrument[] orchestra = new Instrument[20];
        for(int i = 0; i < orchestra.length; i++){
            orchestra[i] = gen.next();
        }
        tuneAll(orchestra);
    }
}
class Instrument{
    void play(Note n){
        System.out.println("Instrument.play() " + n);
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument{
    void play(Note n){
        System.out.println("Wind.play() " + n);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument{
    void play(Note n){
        System.out.println("Percussion.play() " + n);
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument{
    void play(Note n){
        System.out.println("Stringed.play() " + n);
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind{
    void play(Note n){
        System.out.println("Brass.play() " + n);
    }
    void adjust(){
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind{
    void play(Note n){
        System.out.println("Woodwind.play() " + n);
    }
    String what(){
        return "Woodwind";
    }
}