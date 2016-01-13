package thinking.in.java.chapter7.p2;

/**
 * Created by Administrator on 2016/1/13.
 */
public class P2 extends Detergent{
    public void scrub(){
        append("P2.scrub()");
        super.scrub();
    }

    public void sterilize(){}
}

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void scrub(){
        append("scrub()");
    }
}

class Detergent extends Cleanser{
    public void scrub(){
        append("Detergent.scrub()");
        super.scrub();
    }

    public static void main(String[] args){
        new Detergent().scrub();
    }
}