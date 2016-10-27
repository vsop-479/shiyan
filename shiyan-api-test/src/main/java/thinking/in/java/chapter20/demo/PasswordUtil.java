package thinking.in.java.chapter20.demo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/26.
 * 三种标准注解：
 * @Deprecated
 @SuppressWarnings({"",""})
 @Override
 四种元注解：专门用来注解其他注解
 @Target
 @Retention
 @Document
 @Inherited
 */
public class PasswordUtil {
    @UserCase(id = 47, description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UserCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UserCase(id = 49, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prePassWords, String password){
        return !prePassWords.contains(password);
    }

    public static void main(String[] args){
        new PasswordUtil().encryptPassword("");
    }
}
