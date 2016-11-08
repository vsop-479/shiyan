package shiyan.test.practice;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/8.
 */
public class Circle extends Shape implements Serializable{
    private float radius;
//  transient 修饰，不序列化
    transient int color;
//    static 非对象属性，不序列化
    public static String type = "Circle";
}

class Shape{
//    没有Serializable，不序列化
    public String name;
}