package shiyan.test.examination.card_game.card_factory.base;

import shiyan.test.examination.card_game.card.base.Card;

/**
 * Created by Administrator on 2017/2/23.
 */
public interface CardFactory {
    public Card createCard(int value);
}
