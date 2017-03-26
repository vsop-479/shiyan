package shiyan.test.inherit;

/**
 * Created by Administrator on 2017/1/19.
 */
public class S extends F{
    public S(String d){
        super(d);
    }

    public String toSuperString(){
        return super.toString();
    }

    public int superHashCode(){
        return super.hashCode();
    }
}
