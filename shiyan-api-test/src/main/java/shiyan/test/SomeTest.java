package shiyan.test;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/17.
 */
public class SomeTest {
    public static void main(String[] args){
       String s = "html5|os|H5WEIXIN";
        System.out.println("html5|os|H5WEIXIN".indexOf("weixin"));
        System.out.println("html5|os|H5WEIXIN".indexOf("H5WEIXIN"));

        Map<String, String> configMap = new HashMap<String, String>();
        String[] oslist = "1:ios,2:android,3:cms,4:work,5:html5,6:weixin,7:H5WEIXIN".split(",");
        for (String l : oslist) {
            String[] o = l.split(":");
            //序号， os
            configMap.put(o[0], o[1]);
        }
        System.out.println(configMap.get("7"));
    }
}
