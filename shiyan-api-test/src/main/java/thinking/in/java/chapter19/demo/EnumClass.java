package thinking.in.java.chapter19.demo;

/**
 * Created by Administrator on 2016/11/3.
 */
public class EnumClass {
    public static void main(String[] args){
        for(Shrubbery s : Shrubbery.values()){
//            enum实例的声明顺序
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("------------------------------------");
        }
    }
}

enum Shrubbery{
    GROUND, CRAWLING, HANGING
}