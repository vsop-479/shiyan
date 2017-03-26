package shiyan.test.zookeeper.configureCenter.watcher;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import shiyan.test.zookeeper.configureCenter.Constant;

import java.io.IOException;

/**
 * Created by Administrator on 2017/3/3.
 * 使用zookeeper watcher监听数据的改变
 */
public class Client {
    private ZooKeeper zooKeeper = null;
    public Client() throws IOException {
        zooKeeper = new ZooKeeper(Constant.connect_string, Constant.session_time_out, getWatcher());
    }

    /**
     * 监听，当节点数据改变时，得到通知。
     * @return
     */
    private Watcher getWatcher(){
        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                try {
                    if(zooKeeper == null){
                        return;
                    }
                    byte[] data = zooKeeper.getData(event.getPath(), this, null);
                    System.out.println("update data to: " + new String(data));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (KeeperException e) {
                    e.printStackTrace();
                }

            }
        };
        return watcher;
    }

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        Client client = new Client();
        byte[] data = client.zooKeeper.getData(Constant.path, null, null);
        System.out.println("default data: " + new String(data));
        System.in.read();
    }
}
