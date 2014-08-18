package com.opportunity.ui;
import java.io.ObjectInputStream.GetField;

import com.opportunity.ui.clickactions.*;

public class Driver {
	
	private static Player p1;
	private static Player p2;
	private static OpportunityUI opportunityUI;
	
	public static void main(String[] args) {
		opportunityUI = new OpportunityUI("Katrina Michaela "
				+ "Delfin and Shaun Cassidy Calagos");
		
		p1 = new Player("Shaun", 1);
		p2 = new Player("Kat", 2);
		
		PlayAnEvent p = new PlayAnEvent(opportunityUI.getBtnPlayEvent());
		MakePropertyPrimeInvestment m = new MakePropertyPrimeInvestment
				(opportunityUI.getBtnMakePrimeInvestment());
		EndTurn e = new EndTurn(opportunityUI.getBtnEndTurn());
		InvestOnOpportunity i = new InvestOnOpportunity(opportunityUI.getBtnInvestOnOpportunity());
		
		opportunityUI.addClickAction(p);
		opportunityUI.addClickAction(m);
		opportunityUI.addClickAction(e);
		opportunityUI.addClickAction(i);
		
		p.addGameData(p1);
		p.addGameData(p2);
		m.addGameData(p1);
		m.addGameData(p2);
		e.addGameData(p1);
		e.addGameData(p2);
		i.addGameData(p1);
		i.addGameData(p2);
		
		startGame();
				
	}
	
	public static void startGame() {
		p1.shuffleDeck();
		p2.shuffleDeck();
		
		for (int index = 0; index < 3; index++) {
			opportunityUI.getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
			p1.removeCardFromDeck();
			opportunityUI.getGameTable().getPlayer2Pane().addCardToHand(p2.getCardFromDeck().getCardImage());
			p2.removeCardFromDeck();
		}
		
		p1.setSpendingLimit(10000);
		p2.setSpendingLimit(10000);
		
		opportunityUI.setDeckCardCountOfPlayer(p1.getDeckSize(), 1);
		opportunityUI.setDeckCardCountOfPlayer(p2.getDeckSize(), 2);
		
		opportunityUI.setMoneyOfPlayer(1, 10000);
		opportunityUI.setMoneyOfPlayer(2, 10000);
		
		opportunityUI.setSpendingLimitOfPlayer(1, 10000);
		opportunityUI.setSpendingLimitOfPlayer(2, 10000);
		
		opportunityUI.removeCardImageOfPrimeInvestmentCard(1);
		
		opportunityUI.start();

	}
}
