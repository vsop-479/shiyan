package shiyan.test.socket.tcp;

import shiyan.test.socket.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created by Administrator on 2015/9/21.
 */
public class Client {

    public static void main(String[] args){
        String host = "localhost";
        int port = Constants.PORT;
        byte[] msg = "the grammar did not offer total coverage of the language".getBytes();
        Socket socket = null;
        try {
            socket = new Socket(host, port);
            System.out.println("Connected to server...sending echo string");
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(msg);
            outputStream.flush();
            int totalRec = 0;
            int length = msg.length;
            int oneceRec = 0;
            int count = 0;
            while(totalRec < length){
                if((oneceRec = inputStream.read(msg, totalRec, length - totalRec)) == -1){
                    throw new SocketException("Connection closed prematurely");
                }
                totalRec += oneceRec;
                count++;
            }
            System.out.println("Received: " + new String(msg));
            System.out.println("count: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
