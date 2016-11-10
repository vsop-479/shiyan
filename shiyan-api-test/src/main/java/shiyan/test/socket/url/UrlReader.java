package shiyan.test.socket.url;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2016/11/9.
 */
public class UrlReader {
    static{
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession sslSession) {
                if(hostname.equals("www.guwenna.com")){
                    return true;
                }
                return false;
            }
        });
    }

    public static void main(String[] args){
        try {
            String urls = "https://www.guwenna.com";
//            urls = "http://www.cnblogs.com/linjiqin/archive/2011/06/10/2077237.html";
            URL url = new URL(urls);
            URLConnection conn = url.openConnection();
            InputStream in = conn.getInputStream();
            BufferedInputStream bin = new BufferedInputStream(in);
            byte[] b = new byte[1024];
            while(bin.read(b) != -1){
                System.out.println(new String(b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
