package shiyan.common.utils;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2016/5/10.
 */
public class GsonUtil {
    private static class GsonHolder{
        private static Gson gson = new Gson();
    }
    public static Gson get(){
        return GsonHolder.gson;
    }
}
