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

    public static String getByIdSql(String className) {
        return "GET-BY-ID-" + className.toUpperCase();
    }

    public static String insertSql(String className) {
        return "INSERT-" + className.toUpperCase();
    }


    public static String batchInsertSql(String className) {
        return "BATCH-INSERT-" + className.toUpperCase();
    }

    public static String updateSql(String className) {
        return "UPDATE-" + className.toUpperCase();
    }

    public static String batchUpdateSql(String className) {
        return "BATCH-UPDATE-" + className.toUpperCase();
    }

    public static String deleteSql(String className) {
        return "DELETE-" + className.toUpperCase();
    }
}
