package thinking.in.java.chapter20.demo.orm;

/**
 * Created by Administrator on 2016/10/26.
 */
@DBTable(name = "member")
public class Member {
//   SQLString中的 constraints为@Constraints中的各个默认值
    @SQLString(value = 30)
    String firstName;

    @SQLString(value = 50)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    public String toString(){
        return handle;
    }
}
