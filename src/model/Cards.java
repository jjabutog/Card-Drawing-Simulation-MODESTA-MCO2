package model;

import enums.Rank;
import enums.Suit;

public class Cards {
	private Rank rank;
    private Suit suit;
    private int value;

    public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Cards(Rank rank, Suit suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
	
	

}
