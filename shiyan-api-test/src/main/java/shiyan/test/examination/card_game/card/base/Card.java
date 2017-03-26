package shiyan.test.examination.card_game.card.base;

/**
 * Created by Administrator on 2017/2/22.
 */
public class Card {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                "class=" + getClass().getSimpleName() +
                '}';
    }
}
