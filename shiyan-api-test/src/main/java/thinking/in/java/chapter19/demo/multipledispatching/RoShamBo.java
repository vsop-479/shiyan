package thinking.in.java.chapter19.demo.multipledispatching;

import java.util.Random;

import static thinking.in.java.chapter19.demo.multipledispatching.OutCome.*;

/**
 * Created by Administrator on 2016/11/4.
 */
public class RoShamBo {
    static final int SIZE = 20;
    private static Random rand = new Random(47);
    public static Item newItem(){
        switch (rand.nextInt(3)){
            default:
            case 0:return new Scissors();
            case 1:return new Paper();
            case 2:return new Rock();
        }
    }

    public static void match(Item a, Item b){
        System.out.println(a + " vs. " + b + ": " + a.complete(b));
    }

    public static void main(String[] args){
        for(int i = 0; i < SIZE; i++){
            match(newItem(), newItem());
        }
    }
}

interface Item{
    OutCome complete(Item it);
    OutCome eval(Paper it);
    OutCome eval(Scissors it);
    OutCome eval(Rock it);

}

class Paper implements Item{
    public String toString(){
        return "Paper";
    }

//    如paper.complete(scissors)调用Paper.complete
// 而后是scissors.eval(paper) 调用Scissors.eval(Paper)
    @Override
    public OutCome complete(Item it) {
        return it.eval(this);
    }

    @Override
    public OutCome eval(Paper it) {
        return DRAW;
    }

    @Override
    public OutCome eval(Scissors it) {
        return WIN;
    }

    @Override
    public OutCome eval(Rock it) {
        return LOSE;
    }
}

class Scissors implements Item{
    public String toString(){
        return "Scissors";
    }

    @Override
    public OutCome complete(Item it) {
        return it.eval(this);
    }

    @Override
    public OutCome eval(Paper it) {
        return LOSE;
    }

    @Override
    public OutCome eval(Scissors it) {
        return DRAW;
    }

    @Override
    public OutCome eval(Rock it) {
        return WIN;
    }
}

class Rock implements Item{
    public String toString(){
        return "Rock";
    }

    @Override
    public OutCome complete(Item it) {
        return it.eval(this);
    }

    @Override
    public OutCome eval(Paper it) {
        return WIN;
    }

    @Override
    public OutCome eval(Scissors it) {
        return LOSE;
    }

    @Override
    public OutCome eval(Rock it) {
        return DRAW;
    }
}