package thinking.in.java.chapter2.p11;

/**
 * Created by Administrator on 2015/10/19.
 */
public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColor;
    void changeTheHueOfTheColor(int newHue){
        this.anIntegerRepresentingColor = newHue;
    }
    public static void main(String[] args){
        AllTheColorsOfTheRainbow o = new AllTheColorsOfTheRainbow();
        o.changeTheHueOfTheColor(2);
        System.out.println(o.anIntegerRepresentingColor);
    }
}
