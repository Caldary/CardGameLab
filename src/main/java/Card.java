public class Card {
    private CardRank rank;
    private SuitType suit;

    public Card(CardRank rank, SuitType suit){
        this.rank = rank;
        this.suit = suit;
    }

    public CardRank getRank() {
        return this.rank;
    }

    public SuitType getSuit() {
        return this.suit;
    }
}
