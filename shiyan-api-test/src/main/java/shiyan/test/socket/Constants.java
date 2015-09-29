package shiyan.test.socket;

/**
 * Created by Administrator on 2015/9/23.
 */
public class Constants {
    public static final int PORT = 9400;
    public static final int BUFSIZE = 32; // Size of receive buffer
    public static final int TIMEOUT = 3000; // Resend timeout (milliseconds)
    public static final int MAXTRIES = 5; // Maximum retransmissions
    public static final int ECHOMAX = 65600; // Maximum size of echo datagram
}
