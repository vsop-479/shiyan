package shiyan.test.examination.card_game;

import shiyan.test.examination.card_game.card.base.Card;
import shiyan.test.examination.card_game.card_factory.BoxFactory;
import shiyan.test.examination.card_game.card_factory.FlowerFactory;
import shiyan.test.examination.card_game.card_factory.HeartFactory;
import shiyan.test.examination.card_game.card_factory.SpadeFactory;
import shiyan.test.examination.card_game.card_factory.base.CardFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 400-890-0000 转 688561
 * 53580
 * Created by Administrator on 2017/2/23.
 * 115844
 * 4000-325706-113560
 * 4000-880099-47693
 */
public class CardProvider {
    public static List<Card> cardList = new ArrayList<>(54);
    public static List<Card> player1 = new ArrayList<>(18);
    public static List<Card> player2 = new ArrayList<>(18);
    public static List<Card> player3 = new ArrayList<>(18);

    public static void reloadCard(){
        cardList.clear();
        player1.clear();
        player2.clear();
        player3.clear();
        loadSubCard(new BoxFactory());
        loadSubCard(new FlowerFactory());
        loadSubCard(new HeartFactory());
        loadSubCard(new SpadeFactory());
    }

    private static void loadSubCard(CardFactory cf){
        for(int i = 1; i < 14; i++){
            cardList.add(cf.createCard(i));
        }
    }

    public static void offerCard(){
        Random random = new Random();
        int k = random.nextInt(55) % 3;
        while (!cardList.isEmpty()){
            int size = cardList.size();
            int i = random.nextInt(size);
            Card card = cardList.remove(i);
            if(k == 0){
                player1.add(card);
            }else if(k == 1){
                player2.add(card);
            }else{
                player3.add(card);
            }
            k++;
            if(k == 3){
                k = 0;
            }
//            System.out.print(i + ",");
        }
    }

    public static void main(String[] args){
        reloadCard();
        offerCard();
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println("===========================================");

        reloadCard();
        offerCard();
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println("===========================================");

        reloadCard();
        offerCard();
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println("===========================================");

        reloadCard();
        offerCard();
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println("===========================================");
    }

}
