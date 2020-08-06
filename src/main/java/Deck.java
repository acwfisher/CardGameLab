import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void generateCards() {
        RankType[] ranks = RankType.values();
        SuitType[] suits = SuitType.values();
        // Loop over all the suit and rank types
        for (RankType rank : ranks) {
            for (SuitType suit : suits) {
                // Create a card for each combo
                Card card = new Card(suit, rank);
                // Put each created card into the ArrayList
                cards.add(card);

            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }


    public int getARandomNum() {
        Random rand = new Random();
        int rand1 = rand.nextInt();
        return rand1;
    }

    public void dealCard() {
        cards.remove(getARandomNum());
    }


}
