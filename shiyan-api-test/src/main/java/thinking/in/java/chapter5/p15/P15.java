package thinking.in.java.chapter5.p15;

/**
 * Created by Administrator on 2015/12/7.
 */
public class P15 {
    private String name;
    private int age;

    public P15(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        P15 lili = new P15("lili", 7);
        System.out.println(lili);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        P15 p15 = (P15) o;

        if (age != p15.age) return false;
        if (name != null ? !name.equals(p15.name) : p15.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "P15{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
