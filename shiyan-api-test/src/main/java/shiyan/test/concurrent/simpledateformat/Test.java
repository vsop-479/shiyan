package shiyan.test.concurrent.simpledateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Administrator on 2016/12/7.
 * not synchronized
 * Date formats are not synchronized.
 * It is recommended to create separate format instances for each thread.
 * If multiple threads access a format concurrently, it must be synchronized
 * externally.
 *
 * 日期格式是不同步的。建议为每个线程创建独立的格式实例。如果多个线程同时访问一个格式，则它必须是外部同步的
 */
public class Test {
    public static final DateFormat d = DateFormat.getInstance();
    public static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(d.format(Calendar.getInstance().getTime()));
                    try {
                        System.out.println(d.parse("2017-01-01 11:12:11.343").toString());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}

