package shiyan.test.zookeeper.configureCenter.watcher;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import shiyan.test.zookeeper.configureCenter.Constant;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/3.
 * 使用zookeeper配置数据
 */
public class ConfigureManager {
    private ZooKeeper zooKeeper;

    /**
     * 返回服务端zookeeper，即负责管理配置的zookeeper。
     * @return
     * @throws IOException
     */
    public ConfigureManager() throws IOException {
        zooKeeper = new ZooKeeper(Constant.connect_string, Constant.session_time_out, null);
    }



    /**
     * 创建node
     * 写入默认数据
     */
    private void initNode() throws IOException, KeeperException, InterruptedException {
        Stat exists = zooKeeper.exists(Constant.path, false);
        if(exists == null){
            //创建节点，写入默认数据，不开启ACL权限控制，节点永久保存（即客户端shutdown了也不会消失）。
            zooKeeper.create(Constant.path, "default-data".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
    }

    /**
     * 更新节点下数据
     * @param data
     * @throws IOException
     * @throws KeeperException
     * @throws InterruptedException
     */
    public void updateDate(String data) throws IOException, KeeperException, InterruptedException {
        zooKeeper.setData(Constant.path, data.getBytes(), 1);
    }

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {
        ConfigureManager configureManager = new ConfigureManager();
        configureManager.initNode();
        configureManager.updateDate("update data");
        configureManager.zooKeeper.close();
    }

}
