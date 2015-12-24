package shiyan.framework.dao.myBatis;

/**
 * Created by Administrator on 2015/8/24.
 */
public class MyBatisUtil {
    public static String getAllSql(String className){
        return "GET-ALL-" + className.toUpperCase();
    }

    public static String getAllDistinctSql(String className) {
        return "GET-ALL-DISTINCT-" + className.toUpperCase();
    }

    public static String getSql(String className) {
        return "GET-" + className.toUpperCase();
    }

    public static String saveSql(String className) {
        return "SAVE-" + className.toUpperCase();
    }
}
