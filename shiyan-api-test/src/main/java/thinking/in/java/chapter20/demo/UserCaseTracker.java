package thinking.in.java.chapter20.demo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/10/26.
 * 如果没有用来读取注解的工具，那注解不会比注释更有用。
 */
public class UserCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> cl){
        for(Method m : cl.getDeclaredMethods()){
            UserCase uc = m.getAnnotation(UserCase.class);
            if(uc != null){
                System.out.println("Found Use Case:" + uc.id() + " " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for(int i : useCases){
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args){
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtil.class);
    }
}
