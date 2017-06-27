package shiyan.test.algorithm.iplist;

import shiyan.test.annotation.Interceptor;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
public class IPList {
    private static final long SIZE = new Double(Math.pow(2, 32) ).longValue();
    public static void main(String[] args){
        getIPList();
    }

//    BitSet只能set(int),所以范围只能0-Integer.MAX_VALUE.
//    但数组的定义最大也是int，所以仍采用bitset
    public static BitSet getIPList(){
        BitSet bitSet1 = new BitSet(Integer.MAX_VALUE);
        BitSet bitSet2 = new BitSet(Integer.MAX_VALUE);
        long rem = SIZE - Integer.MAX_VALUE - Integer.MAX_VALUE;
        BitSet bitSet3 = new BitSet(new Long(rem).intValue());
        for(long l = 0; l < SIZE; l++){
            int index1 = new Long(l / Integer.MAX_VALUE).intValue();
            int index2 = new Long(l % Integer.MAX_VALUE).intValue();
            if(index1 == 0){
                bitSet1.set(index2);
            }else if(index1 == 1){
                bitSet2.set(index2);
            }else{
                bitSet3.set(index2);
            }
        }
        return bitSet1;
    }

    public static long ip2long(String ip){
        String[] ips = ip.split("\\.");
        long l = 0;
        for(int i = 0; i < ips.length; i++){
            l = ((l << 8) + Long.valueOf(ips[i]));
        }
        return l;
    }

    public static void testIP2long(){
        System.out.println(ip2long("192.168.1.1"));
//        int会发生溢出，必须带l，否则long l = 0xc0a80101会被当成int.
        System.out.println(0xc0a80101l);
        System.out.println(ip2long("255.255.255.255"));
//        int会发生溢出，必须带l，否则long l = 0xffffffff会被当成int.
        System.out.println(0xffffffffl);
        System.out.println(ip2long("115.28.39.95"));
//        不会溢出，不必定义成long
        System.out.println(0x731c275f);
    }
}
