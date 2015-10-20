package thinking.in.java.chapter3.p5_p6;

/**
 * Created by Administrator on 2015/10/20.
 */
public class Dog {
    private String name;
    private String says;

    public static void main(String[] args){
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        System.out.println("name: " + spot.name + " says: " + spot.says);
        System.out.println("name: " + scruffy.name + " says: " + scruffy.says);

        Dog spot2 = spot;
        System.out.println(spot2 == spot);
        System.out.println(spot2.equals(spot));
    }
}
