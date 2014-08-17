package com.opportunity.ui.clickactions;

import java.util.ArrayList;
import javax.swing.JComponent;
import com.opportunity.ui.*;

public class InvestOnOpportunity extends ClickAction {
	public InvestOnOpportunity(JComponent source) {
		super(source);
	}
	
	public InvestOnOpportunity(ArrayList<JComponent> sources) {
		super(sources);
	}

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		
		if (this.getYourGameData().get(0) instanceof Player) {
			Player p1 = (Player) this.getYourGameData().get(0);
			
			double chance = Math.random();
		      if (chance < 0.1) {
		    	  getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    	  p1.removeCardFromDeck();
		    	  getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    	  p1.removeCardFromDeck();
		    	  getOpportunityUI().setDeckCardCountOfPlayer(p1.getDeckSize(), p1.getPlayerNum());
		    	  getOpportunityUI().setSpendingLimitOfPlayer(p1.getPlayerNum(), p1.getMoney() - 1000);
		    	  
		      } else {
		    	  getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    	  p1.removeCardFromDeck();
		    	  getOpportunityUI().setDeckCardCountOfPlayer(p1.getDeckSize(), p1.getPlayerNum());
		    	  getOpportunityUI().setSpendingLimitOfPlayer(p1.getPlayerNum(), p1.getMoney() - 1000);
		      }
		}
	}
}
