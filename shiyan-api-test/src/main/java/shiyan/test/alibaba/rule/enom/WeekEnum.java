package shiyan.test.alibaba.rule.enom;

/**
 * Created by Administrator on 2017/3/14.
 * WeekEnum的实例（枚举值）只能在内部构造，
 * 所以WeekEnum构造方法不能public。
 */
public enum WeekEnum {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int no;
    WeekEnum(int no){
          this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}

class Test{
    void f(){
        WeekEnum.MONDAY.getNo();
    }
}