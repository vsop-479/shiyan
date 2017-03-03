package shiyan.test.zookeeper.configureCenter;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

/**
 * Created by Administrator on 2017/3/3.
 */
public class ConfigureCenter {
    public static void f() throws IOException, KeeperException, InterruptedException {
        ZooKeeper zooKeeper = null;
        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println(watchedEvent);
            }
        };
        zooKeeper = new ZooKeeper("10.6.27.215:2181,10.6.27.216:2181,10.6.27.217:2181", 50000, watcher);
//返回节点的状态，如果节点不存在，返回null。并监听
        Stat exists = zooKeeper.exists("/configureCenter", true);
        if(exists != null){
            if(zooKeeper.exists("/configureCenter/child1", true) != null){
//            节点存在，可以删除节点，版本-1表示所有版本
                zooKeeper.delete("/configureCenter/child1", -1);
            }
//            节点存在，可以删除节点，版本-1表示所有版本
            zooKeeper.delete("/configureCenter", -1);
        }
//创建节点，并向节点写入数据"a1b2c3d4e5"，不开启ACL权限控制，节点永久保存（即客户端shutdown了也不会消失）。
        zooKeeper.create("/configureCenter", "a1b2c3d4e5".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

//返回子节点的状态，如果节点不存在，返回null。并监听
        Stat exists1 = zooKeeper.exists("/configureCenter/child1", true);
        if(exists != null){
//            节点存在，可以删除节点，版本-1表示所有版本
            zooKeeper.delete("/configureCenter/child1", -1);
        }
        zooKeeper.create("/configureCenter/child1", "a1b2c3d4e5/child".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zooKeeper.close();
    }

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {
        f();
    }
}
