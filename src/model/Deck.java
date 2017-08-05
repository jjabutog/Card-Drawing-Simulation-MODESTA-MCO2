package model;

import enums.Rank;
import enums.Suit;

public class Deck {
	private int numCard;
	private Cards[] cards;
	
	//initialize deck with 52 cards.
	public Deck(int numCard){
		Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        this.numCard = numCard;  //numCard = -1;
		this.cards = new Cards[52];
        for (Rank rank  : ranks)
            for(Suit suit : suits) {
                this.numCard++;
                cards[this.numCard] = new Cards(rank,suit);
            }
		
	}
	
	public Cards drawCard(int num){
		
	}
	
	
	
	public int getNumCard() {
        return this.numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public Cards[] getCards() {
        return cards;
    }

    public void setCards(Cards[] cards) {
        this.cards = cards;
    }
	

}
