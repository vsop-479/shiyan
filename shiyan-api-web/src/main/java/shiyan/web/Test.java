package shiyan.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Test {
    public static void main(String[] args){
        redisCluster();
    }

    public static void redisCluster(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        RedisTemplate redisTemplate = (RedisTemplate) context.getBean("redisTemplate");
        Object a1 = redisTemplate.opsForValue().get("dd");
        String value = (String) redisTemplate.opsForValue().get("hello");
        value = (String) redisTemplate.opsForValue().get("foo");
        System.out.println();
    }
}
