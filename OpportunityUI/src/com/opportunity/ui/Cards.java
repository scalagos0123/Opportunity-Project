package com.opportunity.ui;

import java.util.ArrayList;

public class Cards extends Deck {
	protected ArrayList<Event> cardEvent;
	protected ArrayList<Asset> cardAsset;
	protected ArrayList<Property> cardProperty;
	protected String name;
	protected String type;
	protected int cost;
	
	public Cards(String name, String type, int cost) {
		this.name = name;
		this.type = type;
		this.cost = cost;
	}
	
	public ArrayList<Event> getCardEvent() {
		return cardEvent;
	}
	
	public ArrayList<Asset> getCardAsset() {
		return cardAsset;
	}
	
	public ArrayList<Property> getCardProperty() {
		return cardProperty;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}	
