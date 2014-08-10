package com.opportunity.ui;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Cards> cards;
	
	public Deck() {
		cards = new ArrayList<Cards>();
	}
	
	public int getDeckCount() {
		return cards.size();
	}
	
	public Cards getCardAtDeck() {
		return cards.get(0);
	}
	
	public Cards getCardAtDeck(int cardsNeeded) {
		Cards card = null;
		for (int i = 0; i < cardsNeeded; i++) {
			card = cards.get(i);
		}
		
		return card;
	}
}
