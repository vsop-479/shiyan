package thinking.in.java.chapter8.p15;

/**
 * Created by Administrator on 2016/2/17.
 * 结果：
 * Glyph() before draw()（先构造基类）
 * RoundGlyph.RoundGlyph(), radius = 0（draw被覆盖，但RoundGlyph未构造，radius也未初始化，radius为0）
 * Glyph() after draw()（构造基类）
 * RoundGlyph.RoundGlyph(), radius = 5（构造自身）
 */
class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
public class PolyConstructors {
    public static void main(String[] args){
        new RoundGlyph(5);
    }
}
