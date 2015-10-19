package shiyan.test.socket.vote;

import java.io.IOException;

/**
 * Created by Administrator on 2015/10/16.
 */
public interface VoteMsgCoder {
    /**
     * 序列化
     * @param msg
     * @return
     * @throws IOException
     */
    byte[] toWire(VoteMsg msg) throws IOException;

    /**
     * 反序列化
     * @param input
     * @return
     * @throws IOException
     */
    VoteMsg fromWire(byte[] input) throws IOException;
}
