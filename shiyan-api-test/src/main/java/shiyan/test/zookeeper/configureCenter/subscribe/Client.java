package shiyan.test.zookeeper.configureCenter.subscribe;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import shiyan.test.zookeeper.configureCenter.Constant;

import java.io.IOException;

/**
 * Created by Administrator on 2017/3/3.
 * 使用ZkClient subscribeDataChanges监听数据的改变
 */
public class Client {
    private ZkClient zkClient = null;

    /**
     * 返回服务端zookeeper，即负责管理配置的zookeeper。
     * @return
     * @throws java.io.IOException
     */
    public Client() throws IOException {
        zkClient = new ZkClient(Constant.connect_string, Constant.session_time_out);
        zkClient.subscribeDataChanges(Constant.path, new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {
                System.out.println(s + " update data to: " + o);
            }

            @Override
            public void handleDataDeleted(String s) throws Exception {
                System.out.println(s + " delete");
            }
        });
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        Object o = client.zkClient.readData(Constant.path);
        System.out.println(o);
        System.in.read();
    }
}
