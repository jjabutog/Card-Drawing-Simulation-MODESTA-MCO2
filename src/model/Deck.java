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
            	
            	Cards card = new Cards(rank, suit);
            	
            	switch (rank) {
            	
            		case ACE: card.setValue(1);
            		break;
            		
            		case TWO: card.setValue(2);
            		break;
            		
            		case THREE: card.setValue(3);
            		break;
            		
            		case FOUR: card.setValue(4);
            		break;
            		
            		case FIVE: card.setValue(5);
            		break;
            		
            		case SIX: card.setValue(6);
            		break;
            		
            		case SEVEN: card.setValue(7);
            		break;
            		
            		case EIGHT: card.setValue(8);
            		break;
            		
            		case NINE: card.setValue(9);
            		break;
            		
            		case TEN: card.setValue(10);
            		break;
            		
            		case JACK: card.setValue(11);
            		break;
            		
            		case QUEEN: card.setValue(12);
            		break;
            		
            		case KING: card.setValue(13);
            		break;
            		
            	}
            	          	
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
	
	
	public void insertCard(Cards card){
		cards.add(card);
		shuffle();
	}

	
    public ArrayList<Cards> getCards() {
        return cards;
    }
    
    public void setCards(ArrayList<Cards> cards){
    	this.cards = cards;
    }

   
	

}
