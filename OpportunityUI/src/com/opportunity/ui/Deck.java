package com.opportunity.ui;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Cards> deck;
	
	public Deck() {
		deck = new ArrayList<Cards>();
		
		Event taxReturn = new Event("Get Tax Returns", "Event", 0, 
				CardImageLoader.GET_TAX_RETURNS);
		Event birHunting = new Event("BIR Hunting Event", "Event", 0, 
				CardImageLoader.BIR_HUNTING_BEGINS);
		Event restoreBalance = new Event("Restore Balance", "Event", 0, 
				CardImageLoader.RESTORE_BALANCE);
		
		Asset vacantPropertyLot = new Asset("Vacant Property Lot", "Asset", 7500, 
				1000, 3250, 5000, CardImageLoader.VACANT_PROPERTY_LOT);
		Asset stockInvestment = new Asset("Stock Investment", "Asset", 9000,
				500, 4500, 10000, CardImageLoader.STOCK_INVESTMENT);
		Asset timeInvestmentAccount = new Asset("Time Investment Account", "Asset", 15000,
				100, 7500, 15000, CardImageLoader.TIME_INVESTMENT);
		
		Property karenL0 = new Property("Karen Dairy A Franchise", "Property", 500, 
				0, 1500, 1000, 500, 0, CardImageLoader.KAREN_DAIRY_A_LVL0);
		Property karenL1 = new Property("Karen Dairy A Franchise", "Property", 500, 
				2500, 7500, 1000, 500, 1, CardImageLoader.KAREN_DAIRY_A_LVL1);
		Property karenL2 = new Property("Karen Dairy A Franchise", "Property", 500, 
				10000, 30000, 1000, 500, 2, CardImageLoader.KAREN_DAIRY_A_LVL2);
		Property karenL3 = new Property("Karen Dairy A Franchise", "Property", 500, 
				100000, 200000, 1000, 500, 3, CardImageLoader.KAREN_DAIRY_A_LVL3);
		
		Property mikkaL0 = new Property("Mikka N. Ko Automotives Franchise", "Property", 500, 
				0, 1500, 50000, 500, 0, CardImageLoader.MIKKA_N_KO_LVL0);
		Property mikkaL1 = new Property("Mikka N. Ko Automotives Franchise", "Property", 500, 
				2500, 7500, 50000, 500, 1, CardImageLoader.MIKKA_N_KO_LVL1);
		Property mikkaL2 = new Property("Mikka N. Ko Automotives Franchise", "Property", 500, 
				10000, 30000, 50000, 500, 2, CardImageLoader.MIKKA_N_KO_LVL2);
		Property mikkaL3 = new Property("Mikka N. Ko Automotives Franchise", "Property", 500, 
				100000, 200000, 50000, 500, 3, CardImageLoader.MIKKA_N_KO_LVL3);
		
		Property saRissaL0 = new Property("Sa Rissa Restore Grocers Franchise", "Property", 700, 
				0, 5000, 50000, 700, 0, CardImageLoader.SA_RISSA_RESTORE_LVL0);
		Property saRissaL1 = new Property("Sa Rissa Restore Grocers Franchise", "Property", 700, 
				6500, 7500, 50000, 700, 1, CardImageLoader.SA_RISSA_RESTORE_LVL1);
		Property saRissaL2 = new Property("Sa Rissa Restore Grocers Franchise", "Property", 700, 
				70000, 75000, 50000, 700, 2, CardImageLoader.SA_RISSA_RESTORE_LVL2);
		Property saRissaL3 = new Property("Sa Rissa Restore Grocers Franchise", "Property", 700, 
				100000, 200000, 50000, 700, 3, CardImageLoader.SA_RISSA_RESTORE_LVL3);
		
		Property ospyThallL0 = new Property("Ospy Thall Pharmacy Franchise", "Property", 2000,
				0, 2100, 100000, 1500, 0, CardImageLoader.OSPY_THALL_LVL0);
		
		for (int i = 0; i < 4; i++) {
			deck.add(taxReturn);
			deck.add(birHunting);
			deck.add(restoreBalance);
			deck.add(vacantPropertyLot);
			deck.add(stockInvestment);
			deck.add(timeInvestmentAccount);
			deck.add(karenL0);
			deck.add(saRissaL0);
			deck.add(mikkaL0);
			deck.add(ospyThallL0);
		}
		
//		cards.add(karenL0);
//		cards.add(karenL1);
//		cards.add(karenL2);
//		cards.add(karenL3);
//		
//		cards.add(saRissaL0);
//		cards.add(saRissaL1);
//		cards.add(saRissaL2);
//		cards.add(saRissaL3);
//		
//		cards.add(mikkaL0);
//		cards.add(mikkaL1);
//		cards.add(mikkaL2);
//		cards.add(mikkaL3);
//		
	}
	
	public int getDeckCount() {
		return deck.size();
	}
	
	public Cards getCard() {
		return deck.get(0);
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Cards getCardIncome(int cardImage) {
		return deck.get(deck.indexOf(cardImage));
	}
	
	public void removeCardOnDeck() {
		deck.remove(0);
	}
}
