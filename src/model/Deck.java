package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import enums.Rank;
import enums.Suit;

public class Deck {
	private int numCard;
	private ArrayList<Cards> cards;
	
	//initialize deck with 52 cards.
	public Deck(){
		Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        
        cards = new ArrayList<Cards>();
        for (Rank rank  : ranks)
            for(Suit suit : suits) {
            	cards.add(new Cards(rank,suit));
            }
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Cards drawCardwithReplacement(){
		
		
		return cards[ThreadLocalRandom.current().nextInt(0,53)];
	}
	
	public Cards drawCardwithoutReplacement(){
		
		return cards.remove(0);
	}
	
	
	
	public int getNumCard() {
        return this.numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public ArrayList<Cards> getCards() {
        return cards;
    }

   
	

}
