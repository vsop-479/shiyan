package thinking.in.java.chapter20.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2016/10/26.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserCase {
//    没有default, 使用注解时，id必须指定。
    public int id();
//    有default, 使用注解时，可以不指定，使用默认值。
    public String description() default "no description";
}
