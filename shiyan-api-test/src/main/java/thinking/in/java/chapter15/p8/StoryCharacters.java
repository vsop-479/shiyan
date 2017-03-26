package thinking.in.java.chapter15.p8;

/**
 * Created by Administrator on 2016/10/28.
 */
public class StoryCharacters {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName() + " " + id;
    }
}
