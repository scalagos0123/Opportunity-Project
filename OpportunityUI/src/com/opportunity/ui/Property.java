package com.opportunity.ui;

public class Property extends Cards {
	private int investmentCost;
	private int primeInvestmentCost;
	private int sellingPrice;
	private int cardLevel;
	
	public Property(String name, String type, int cost, 
			int investmentCost, int income, int primeInvestmentCost, 
			int sellingPrice, int cardLevel, int cardImage) {
		
		super(name,type,cost);
		this.investmentCost = investmentCost;
		this.primeInvestmentCost = primeInvestmentCost;
		this.sellingPrice = sellingPrice;
		this.cardLevel = cardLevel;
		
	}

	public int getInvestmentCost() {
		return investmentCost;
	}

	public int getPrimeInvestmentCost() {
		return primeInvestmentCost;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public int getCardLevel() {
		return cardLevel;
	}

	public void setInvestmentCost(int investmentCost) {
		this.investmentCost = investmentCost;
	}

	public void setPrimeInvestmentCost(int primeInvestmentCost) {
		this.primeInvestmentCost = primeInvestmentCost;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public void setLevel(int cardLevel) {
		this.cardLevel = cardLevel;
	}
}
