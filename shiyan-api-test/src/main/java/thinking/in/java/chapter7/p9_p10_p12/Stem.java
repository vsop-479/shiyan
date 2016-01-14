package thinking.in.java.chapter7.p9_p10_p12;

/**
 * Created by Administrator on 2016/1/14.
 * 先构造Root，构造Root之前先初始化Root的c1,c2,c3
 * 后构造Stem，构造Stem之前先初始化Stem的c1,c2,c3
 */
public class Stem extends Root{
    Component1 c1 = new Component1("Stem");
    Component2 c2 = new Component2("Stem");
    Component3 c3 = new Component3("Stem");
    public Stem(){
        System.out.println("Stem");
    }

    public void dispose(){
        System.out.println("Stem dispose");
        c3.dispose("Stem");
        c2.dispose("Stem");
        c1.dispose("Stem");
        super.dispose();
    }
    public static void main(String[] args){
        Stem stem = new Stem();
        stem.dispose();
    }
}

class Root{
    Component1 c1 = new Component1("Root");
    Component2 c2 = new Component2("Root");
    Component3 c3 = new Component3("Root");
    public Root(){
        System.out.println("Root");
    }
    public void dispose(){
        System.out.println("Root dispose");
        c3.dispose("Root");
        c2.dispose("Root");
        c1.dispose("Root");
    }

}

class Component1{
    public Component1(String source){
        System.out.println(source + ": Component1");
    }
    public void dispose(String source){
        System.out.println(source + ": Component1 dispose");
    }
}

class Component2{
    public Component2(String source){
        System.out.println(source + ": Component2");
    }
    public void dispose(String source){
        System.out.println(source + ": Component2 dispose");
    }

}

class Component3{
    public Component3(String source){
        System.out.println(source + ": Component3");
    }
    public void dispose(String source){
        System.out.println(source + ": Component3 dispose");
    }
}