package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 */
public class Child extends People{
    People father;



    //    默认调用super()。
//    若父类没有无参构造，必须显示的super(args)，否则出错。
    public Child() {
        System.out.print(4);
    }

    public static void main(String[] args){
        new Child("mike");
    }

//    默认调用super()。
//    若父类没有无参构造，必须显示的super(args)，否则出错。
    public Child(String name) {
        System.out.print(3);
        this.name = name;
        father = new People(name + ":F");
    }
}

class People {
    String name;

    public People() {
        System.out.print(1);
    }

    public People(String name) {
        System.out.print(2);
        this.name = name;
    }
}