package shiyan.test.socket.tcp;


import shiyan.test.socket.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by Administrator on 2015/9/23.
 */
public class Server {


    public static void main(String[] args){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(Constants.PORT);
            int recvMsgSize;
            byte[] receiveBuf = new byte[Constants.BUFSIZE]; // Receive buffer
            while(true){
                Socket serSocket = serverSocket.accept();// Get client connection
                SocketAddress clientAddress = serSocket.getRemoteSocketAddress();
                System.out.println("Handling client at " + clientAddress);
                InputStream inputStream = serSocket.getInputStream();
                OutputStream outputStream = serSocket.getOutputStream();
                StringBuilder stb = new StringBuilder();
                int a;
                int count = 0;
                while((a = inputStream.read()) != -1){
                    outputStream.write(a);
                    count++;
                    serverSocket.close();
                    Thread.sleep(1000);
                }
//                while((recvMsgSize = inputStream.read(receiveBuf)) != -1){
//                    stb.append(new String(receiveBuf));
//                    outputStream.write(receiveBuf, 0 , recvMsgSize);
//                    receiveBuf = new byte[Constants.BUFSIZE];
//                }
                System.out.println(stb.toString());
                System.out.println("count: " + count);
                serSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
