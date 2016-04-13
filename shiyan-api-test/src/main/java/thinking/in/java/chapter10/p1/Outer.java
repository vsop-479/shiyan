package thinking.in.java.chapter10.p1;

/**
 * Created by Administrator on 2016/2/29.
 * 注意：在其他类中对Inner初始化
 * Outer outer = new Outer("d");
    Outer.Inner inner = outer.new Inner();
 */
public class Outer {
    private String s;
    public Outer(String s){
        this.s = s;
    }
    public class Inner{
        public String toString(){
            return s;
        }
    }
    Inner getInner(){
        return new Inner();
    }
    public static void main(String[] args){
        Inner i = new Outer("o").getInner();
    }
}
