package shiyan.framework.dao.myBatis.cache;

import org.apache.ibatis.cache.Cache;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import shiyan.framework.dao.util.SerializeUtil;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Administrator on 2016/1/22.
 */
@Component
public class MybatisRedisCache implements Cache{
    @Value("${mybatis.redis.host}")
    private String host;
    @Value("${mybatis.redis.port}")
    private int port;
    //方便测试mybatis二级缓存，实用时可改完集群redis
    public Jedis jedis;
    /** The ReadWriteLock. */
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private String id;

    public MybatisRedisCache(String id){
        this.id = id;
        jedis = new Jedis(host, port);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getSize() {
        return Integer.valueOf(jedis.dbSize().toString());
    }

    @Override
    public void putObject(Object key, Object value) {
        jedis.set(SerializeUtil.serialize(key.toString()), SerializeUtil.serialize(value));
    }

    @Override
    public Object getObject(Object key) {
        byte[] bytes = jedis.get(SerializeUtil.serialize(key.toString()));
        return SerializeUtil.unSerialize(bytes);
    }

    @Override
    public Object removeObject(Object key) {
        //直接删除
//        jedis.del(SerializeUtil.serialize(key));
        //设置为0，交由redis定期或惰性删除
        return jedis.expire(SerializeUtil.serialize(key.toString()), 0);
    }

    @Override
    public void clear() {
        jedis.flushDB();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }
}
