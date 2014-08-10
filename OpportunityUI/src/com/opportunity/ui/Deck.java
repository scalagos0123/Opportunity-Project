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
}
