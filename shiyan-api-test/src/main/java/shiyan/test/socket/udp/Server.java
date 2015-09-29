package shiyan.test.socket.udp;

import shiyan.test.socket.Constants;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * Created by Administrator on 2015/9/23.
 */
public class Server {
    public static void main(String[] args){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(Constants.PORT);
            DatagramPacket packet = new DatagramPacket(new byte[Constants.ECHOMAX], Constants.ECHOMAX);
            while(true){//Run forever, receiving and echoing datagrams
                socket.receive(packet);
                System.out.println("Handling client at " + packet.getAddress().getHostAddress() + " on port " + packet.getPort());
                System.out.print(new String(packet.getData()));
                Arrays.copyOfRange(packet.getData(), packet.getOffset(), packet.getOffset() + packet.getLength());
                socket.send(packet);// Send the same packet back to client
                packet.setLength(Constants.ECHOMAX);
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
