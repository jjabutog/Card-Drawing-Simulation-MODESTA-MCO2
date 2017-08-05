package model;

import enums.Rank;
import enums.Suit;

public class Cards {
	private Rank rank;
    private Suit suit;

    public Cards(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
	
	

}
