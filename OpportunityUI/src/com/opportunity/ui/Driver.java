package com.opportunity.ui;
import com.opportunity.ui.clickactions.*;

public class Driver {
	public static void main(String[] args) {
		OpportunityUI opportunityUI = new OpportunityUI("Katrina Michaela "
				+ "Delfin and Shaun Cassidy Calagos");
		
		Player p1 = new Player("Shaun", 1);
		Player p2 = new Player("Kat", 2);
		
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
		
		for (int index = 0; index < 3; index++) {
			
		}
		
		opportunityUI.start();
		
	}
}
