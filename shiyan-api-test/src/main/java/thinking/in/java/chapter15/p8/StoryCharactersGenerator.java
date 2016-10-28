package thinking.in.java.chapter15.p8;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Administrator on 2016/10/28.
 */
public class StoryCharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
    private Class[] types = {GoodGuys.class, BadGuys.class, BadGuys.class, GoodGuys.class, BadGuys.class, GoodGuys.class, GoodGuys.class, };
    private Random random = new Random(47);

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
//            无权限异常
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public StoryCharactersGenerator(){}
    private int size = 0;
    public StoryCharactersGenerator(int sz){
        size = sz;
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new Iterator<StoryCharacters>() {
            int count = size;
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public StoryCharacters next() {
                count--;
                return StoryCharactersGenerator.this.next();
            }
        };
    }

    public static void main(String[] args){
        StoryCharactersGenerator gen = new StoryCharactersGenerator();
        for(int i = 0; i < 5; i++){
            System.out.println(gen.next());
        }
//        遍历迭代器
        for(StoryCharacters c : new StoryCharactersGenerator(5)){
            System.out.println(c);
        }
    }
}
