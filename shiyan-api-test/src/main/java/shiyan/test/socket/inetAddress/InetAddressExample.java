package shiyan.test.socket.inetAddress;

import java.net.*;
import java.util.Enumeration;

/**
 * Created by Administrator on 2015/9/21.
 */
public class InetAddressExample {
    public static void main(String[] args){
        try{
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if(networkInterfaces == null){
                System.out.println("--No interfaces found--");
            }else{
                while(networkInterfaces.hasMoreElements()){
                    NetworkInterface networkInterface = networkInterfaces.nextElement();
                    System.out.println("Interface " + networkInterface.getName() + ":");
                    Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                    if(!inetAddresses.hasMoreElements()){
                        System.out.println("\t(No addresses for this interface)");
                    }
                    while(inetAddresses.hasMoreElements()){
                        InetAddress inetAddress = inetAddresses.nextElement();
                        System.out.print("\tAddress " + ((inetAddress instanceof Inet4Address ? "(v4)" : (inetAddress instanceof Inet6Address ? "(v6)" : "(?)"))));
                        System.out.println(": " + inetAddress.getHostAddress());
                    }
                }
            }
        }catch(SocketException se){
            System.out.println("Error getting network interfaces:" + se.getMessage());
        }

        for(String host : args){
            try {
                System.out.println(host + ":");
                InetAddress[] addresses = InetAddress.getAllByName(host);
                for(InetAddress address : addresses){
                    System.out.println("\t" + address.getHostName() + "/" + address.getHostAddress());
                }
            } catch (UnknownHostException e) {
                System.out.println("\tUnable to find address for " + host);
            }

        }
    }
}
