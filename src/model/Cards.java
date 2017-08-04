package model;

<<<<<<< HEAD
import enums.Rank;
import enums.Suit;
=======
class Cards {
	private int value;
	private String suit;
>>>>>>> e06af35ffced588b2f7a02f5d4489f11b0188ef1

public class Cards {
	private final Rank rank;
    private final Suit suit;

<<<<<<< HEAD
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
=======
	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
>>>>>>> e06af35ffced588b2f7a02f5d4489f11b0188ef1
	
	

}
