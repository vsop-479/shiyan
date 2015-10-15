package shiyan.test.socket.framer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2015/10/15.
 */
public interface Framer {
    void frameMsg(byte[] message, OutputStream out) throws IOException;
    byte[] nextMsg() throws IOException;
}
