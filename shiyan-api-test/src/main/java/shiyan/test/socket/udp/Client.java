package shiyan.test.socket.udp;

import shiyan.test.socket.Constants;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.*;

/**
 * Created by Administrator on 2015/9/23.
 */
public class Client {
    public static void main(String[] args){
        byte[] msg = "the grammar did not offer total coverage of the language".getBytes();
        DatagramSocket socket = null;
        try {
            InetAddress serverAddress = InetAddress.getByName("localhost");
            socket = new DatagramSocket();
            socket.setSoTimeout(Constants.TIMEOUT);
            // Sending packet
            DatagramPacket sendPacket = new DatagramPacket(msg, msg.length, serverAddress, Constants.PORT);
            // Receiving packet
            DatagramPacket receivePacket = new DatagramPacket(new byte[msg.length], msg.length);
            // Packets may be lost, so we have to keep trying
            int tries = 0;
            boolean receivedResponse = false;
            do {
                socket.send(sendPacket);
                try {
                    socket.receive(receivePacket);
                    if (!receivePacket.getAddress().equals(serverAddress)) {// Check source
                        throw new IOException("Received packet from an unknown source");
                    }
                    receivedResponse = true;
                } catch (InterruptedIOException e) {// We did not get anything
                    tries += 1;
                    System.out.println("Timed out, " + (Constants.MAXTRIES - tries) + " more tries...");
                }
            }while((!receivedResponse) && (tries < Constants.MAXTRIES));

            if(receivedResponse){
                System.out.println(new String(receivePacket.getData()));
            }else{
                System.out.println("No response -- giving up.");
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(socket != null){
                socket.close();
            }
        }
    }
}
