package shiyan.test.ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/14.
 */
public class Test {
    public static void main(String[] args) throws OgnlException {
        ognl();
    }

    public static void ognl() throws OgnlException {
        Student student1 = new Student();
        student1.setAge(10);
        student1.setName("lili");
        Student student2 = new Student();
        student2.setAge(20);
        student2.setName("kiki");
        Map map = new HashMap<>();
        OgnlContext context = new OgnlContext(map);
        context.put("student1", student1);
        context.put("student2", student2);

        Object expression = Ognl.parseExpression("#student2.getName");
        Object value = Ognl.getValue(expression, context, context.getRoot());
        System.out.println(value);
    }
}


class Student{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}