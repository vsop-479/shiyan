package shiyan.test.examination.card_game.card_factory;

import shiyan.test.examination.card_game.card.Box;
import shiyan.test.examination.card_game.card.base.Card;
import shiyan.test.examination.card_game.card_factory.base.CardFactory;

/**
 * Created by Administrator on 2017/2/23.
 */
public class BoxFactory implements CardFactory{
    @Override
    public Card createCard(int value) {
        Card card = new Box();
        card.setValue(value);
        return card;
    }
}
