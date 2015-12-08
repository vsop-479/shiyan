package thinking.in.java.chapter5.p21_p22;

/**
 * Created by Administrator on 2015/12/7.
 */
public class P21 {
    public static void main(String[] args){
        for(Cash cash : Cash.values()){
            System.out.println(cash + ";ordinal:" + cash.ordinal() + ";s:" + cash.s);
            f(cash);
        }

        for(Gender gender : Gender.values()){
            System.out.println(gender + ";ordinal:" + gender.ordinal());
        }
        for(Color color : Color.values()){
            System.out.println(color);
        }
    }

    public static void f(Cash cash){
        switch (cash){
            case C1:
                System.out.println("you are : " + Cash.C1.s);
                break;
            case C2:
                System.out.println("you are : " + Cash.C2.s);
                break;
            case C3:
                System.out.println("you are : " + Cash.C3.s);
                break;
            case C4:
                System.out.println("you are : " + Cash.C4.s);
                break;
            case C5:
                System.out.println("you are : " + Cash.C5.s);
                break;
            case C6:
                System.out.println("you are : " + Cash.C6.s);
                break;
            default:
                System.out.println("you are : " + "假币");
                break;
        }
    }
}

enum Cash{
    C1("0.1"),C2("0.5"),C3("1"),C4("5"),C5("10"),C6("20");
    public String s;
    Cash(String s){
        this.s = s;
    }
}

enum Gender{
    MALE,FEMALE
}

enum Color{
    red,orange,yellow,green,blue_green,blue,purple,black,white
}