import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;
    Deck deck;

    @Before
    public void setup(){
        card = new Card(SuitType.HEARTS, RankType.SEVEN);
        deck = new Deck();

    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.SEVEN, card.getRank());
    }

    @Test
    public void cardHasValueSeven() {
        assertEquals(7, card.getValueFromEnum());
    }

    @Test
    public void has52CardsInDeck() {
        deck.generateCards();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canShuffle() {
        deck.generateCards();
        deck.shuffle();
    }



}
