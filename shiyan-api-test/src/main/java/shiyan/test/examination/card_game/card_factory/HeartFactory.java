package shiyan.test.examination.card_game.card_factory;

import shiyan.test.examination.card_game.card.Heart;
import shiyan.test.examination.card_game.card.base.Card;
import shiyan.test.examination.card_game.card_factory.base.CardFactory;

/**
 * Created by Administrator on 2017/2/23.
 */
public class HeartFactory implements CardFactory{
    @Override
    public Card createCard(int value) {
        Card card = new Heart();
        card.setValue(value);
        return card;
    }
}
