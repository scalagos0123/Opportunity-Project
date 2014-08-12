package com.opportunity.ui;

public class Asset extends Cards {
	private int income;
	private int startingPrice;
	private int priceGrowth;
	
	public Asset(String name, String type, int cost, int card, 
			int income, int startingPrice, int priceGrowth) {
		
		super(name, type, cost);
		this.income = income;
		this.startingPrice = startingPrice;
		this.priceGrowth = priceGrowth;
		
	}
	
	public int getIncome() {
		return income;
	}
	
	public int getStartingPrice() {
		return startingPrice;
	}
	
	public int priceGrowth() {
		return priceGrowth;
	}
}
