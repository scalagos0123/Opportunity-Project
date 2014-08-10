package com.opportunity.ui;

public class Property extends Cards {
	private int investmentCost;
	private int primeInvestmentCost;
	private int sellingPrice;
	private int level[];
	
	public Property(String name, String type, int cost, 
			int investmentCost, int primeInvestmentCost, 
			int sellingPrice, int level[]) {
		
		super(name,type,cost);
		this.investmentCost = investmentCost;
		this.primeInvestmentCost = primeInvestmentCost;
		this.sellingPrice = sellingPrice;
		this.level = level;
		
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

	public int[] getLevel() {
		return level;
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

	public void setLevel(int[] level) {
		this.level = level;
	}
}
