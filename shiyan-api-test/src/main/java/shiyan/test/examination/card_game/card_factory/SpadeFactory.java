package shiyan.test.examination.card_game.card_factory;

import shiyan.test.examination.card_game.card.Spade;
import shiyan.test.examination.card_game.card.base.Card;
import shiyan.test.examination.card_game.card_factory.base.CardFactory;

/**
 * Created by Administrator on 2017/2/23.
 */
public class SpadeFactory implements CardFactory{
    @Override
    public Card createCard(int value) {
        Card card = new Spade();
        card.setValue(value);
        return card;
    }
}
