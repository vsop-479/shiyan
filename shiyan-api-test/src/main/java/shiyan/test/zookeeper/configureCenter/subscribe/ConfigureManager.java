package shiyan.test.zookeeper.configureCenter.subscribe;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import shiyan.test.zookeeper.configureCenter.Constant;

import java.io.IOException;

/**
 * Created by Administrator on 2017/3/3.
 *
 */
public class ConfigureManager {
    private ZkClient zkClient = null;

    /**
     * 返回服务端zookeeper，即负责管理配置的zookeeper。
     * @return
     * @throws java.io.IOException
     */
    public ConfigureManager() throws IOException {
        zkClient = new ZkClient(Constant.connect_string, Constant.session_time_out);
    }

    /**
     * 创建node
     * 写入默认数据
     */
    private void initNode() throws IOException, KeeperException, InterruptedException {
        boolean exists = zkClient.exists(Constant.path);
        if(!exists){
            //创建节点，写入默认数据，不开启ACL权限控制，节点永久保存（即客户端shutdown了也不会消失）。
            zkClient.create(Constant.path, "default-data".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
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
        zkClient.writeData(Constant.path, data);
    }

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {
        ConfigureManager configureManager = new ConfigureManager();
        configureManager.initNode();
        configureManager.updateDate("update data");
        configureManager.zkClient.close();
    }
}
