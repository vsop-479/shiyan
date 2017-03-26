package shiyan.test.annotation;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Administrator on 2017/1/16.
 */
public class Interceptor {

    @Pointcut("@annotation(@Test)")
    private void pointcut(){};
}
