package controller;

import model.Cards;
import view.CardsView;

public class CardsController {
	
	private Cards model;
	private CardsView view;
	
	public CardsController(Cards model,CardsView view){
		this.model = model;
		this.view = view;
	}
	 
	public void setCardValue(int value){
		model.setValue(value);
	}
	
	public int getCardValue(){
		return model.getValue();
	}
	
	public void setCardSymbol(int symbol){
		model.setSymbol(symbol);
	}
	
	public int getCardSymbol(){
		return model.getSymbol();
	}

}
