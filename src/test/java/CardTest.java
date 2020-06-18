import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(CardRank.ACE, SuitType.CLUBS);
    }

    @Test
    public void canGetRank(){
        assertEquals(CardRank.ACE, card.getRank());
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.CLUBS, card.getSuit());
    }

}
