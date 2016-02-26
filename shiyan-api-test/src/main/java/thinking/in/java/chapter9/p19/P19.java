package thinking.in.java.chapter9.p19;

import java.util.Random;

/**
 * Created by Administrator on 2016/2/26.
 * Random(47).nextInt(n)
 * [0,n)
 */
public class P19 {
}
interface Game{
    int play();
}
interface GameFactory{
    Game getGame();
}
class Coin implements Game{
    @Override
    public int play() {
        return new Random(47).nextInt(2);
    }
}
class Dice implements Game{
    @Override
    public int play() {
        return new Random(47).nextInt(6) + 1;
    }
}
class CoinFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Coin();
    }
}
class DiceFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Dice();
    }
}