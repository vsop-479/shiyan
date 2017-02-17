package shiyan.test.practice;

import java.io.*;

/**
 * Created by Administrator on 2016/11/8.
 */
public class Circle extends Shape implements Serializable{

    private static final long serialVersionUID = 1969657629868699247L;

    private float radius;
//  transient 修饰，不序列化
    transient int color;
//    static 非对象属性，不序列化
    public static String type = "Circle";

    public String ss;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}

class Shape{
//    没有Serializable，不序列化
    public String name;
}

/**
 * 序列化测试：
 * 1：transient瞬态字段不被序列化
 * 2：static 类字段不被序列化
 * 3：static serialVersionUID是否序列化？
 * 答：序列化时需要保存serialVersionUID，用于验证反序列化的类和序列化时是否兼容。
 * 4：不可序列化的父类字段，是否序列化？
 * 答：不可序列化的父类字段不会序列化，name为null。
 * 5：private是否序列化？
 * 答：private只限制访问权限，不影响序列化。
 */
class SerializableTest{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Circle c = new Circle();
        c.setRadius(1.2f);
        c.color = 33;
        c.ss = "ss";
        c.name = "name";

        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("d:/circle.txt")));
        oos.writeObject(c);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("d:/circle.txt")));
        Circle c2 = (Circle) ois.readObject();
        System.out.print(c2);
    }
}