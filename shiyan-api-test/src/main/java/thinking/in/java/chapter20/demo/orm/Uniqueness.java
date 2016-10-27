package thinking.in.java.chapter20.demo.orm;

/**
 * Created by Administrator on 2016/10/26.
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
