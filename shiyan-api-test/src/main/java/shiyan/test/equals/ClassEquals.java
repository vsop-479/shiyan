package shiyan.test.equals;

/**
 * Created by Administrator on 2016/12/22.
 * 类是一个对象，且单例
 */
public class ClassEquals {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
//        类是一个对象，且单例所以a1.getClass() == a2.getClass()
        System.out.println(a1.getClass() == a2.getClass());
        System.out.println(a1.getClass().equals(a2.getClass()));
    }
}

class A{
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;

        A a = (A) o;

        if (age != a.age) return false;
        if (name != null ? !name.equals(a.name) : a.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
