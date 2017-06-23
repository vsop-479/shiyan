package shiyan.test.algorithm.iplist;

import shiyan.test.annotation.Interceptor;

import java.util.BitSet;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Administrator on 2017/6/23.
 */
public class IPList {
    private static final long l = new Double(Math.pow(2, 32) ).longValue();
    public static void main(String[] args){
        System.out.println(ip2long("192.168.1.1"));
        System.out.println(0xc0a80101);
        System.out.println(ip2long("255.255.255.255"));
        System.out.println(0xffffffff);
        System.out.println(ip2long("115.28.39.95"));
    }
    public static BitSet getIPList(){
        long s = Double.doubleToLongBits(Math.pow(2, 32));
        BitSet bitSet = new BitSet();
        return bitSet;
    }

    public static long ip2long(String ip){
        String[] ips = ip.split("\\.");
        long l = 0;
        for(int i = 0; i < ips.length; i++){
            l = ((l << 8) + Long.valueOf(ips[i]));
        }
        return l;
    }
}
