package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import enums.Rank;
import enums.Suit;

public class Deck {

	private ArrayList<Cards> cards;
	
	//initialize deck with 52 cards.
	public Deck(){
		//initialize enums
		Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        //arraylist of cards to populate the deck
        cards = new ArrayList<Cards>();
        //for loop to populate the deck
        for (Rank rank  : ranks)
            for(Suit suit : suits) {
            	cards.add(new Cards(rank,suit));
            }
		
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	//gets value of top card then shuffles
	public Cards drawCardwithReplacement(){
		Cards draw = cards.get(0);
		shuffle();
		return draw;
	}
	
	
	//removes from the top of the deck
	public Cards drawCardwithoutReplacement(){
		
		return cards.remove(0);
	}
	
	

	
    public ArrayList<Cards> getCards() {
        return cards;
    }

   
	

}
