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
		
			Player p1 = (Player) this.getYourGameData().get(0);
			Player p2 = (Player) this.getYourGameData().get(1);
			
			if (Player.TURN == 0) {
			double chance = Math.random();
		      if (chance < 0.1) {
		    	  getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    	  p1.removeCardFromDeck();
		    	  getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    	  p1.removeCardFromDeck();
		    	  
		      } else {
		    	  getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    	  p1.removeCardFromDeck();
		      }
		      
		      getOpportunityUI().setDeckCardCountOfPlayer(p1.getDeckSize(), 1);
		      p1.setSpendingLimit(p1.getSpendingLimit() - 1000);
	    	  getOpportunityUI().setSpendingLimitOfPlayer(1, p1.getSpendingLimit());
		      
			} else if (Player.TURN == 1) {
			
			double chance = Math.random();
		      if (chance < 0.1) {
		    	  getOpportunityUI().getGameTable().getPlayer2Pane().addCardToHand(p2.getCardFromDeck().getCardImage());
		    	  p2.removeCardFromDeck();
		    	  getOpportunityUI().getGameTable().getPlayer2Pane().addCardToHand(p2.getCardFromDeck().getCardImage());
		    	  p2.removeCardFromDeck();
		    	  
		    	  
		      } else {
		    	  getOpportunityUI().getGameTable().getPlayer2Pane().addCardToHand(p2.getCardFromDeck().getCardImage());
		    	  p2.removeCardFromDeck();
		      }
		      
		      getOpportunityUI().setDeckCardCountOfPlayer(p2.getDeckSize(), 2);
		      p2.setSpendingLimit(p2.getSpendingLimit() - 1000);
	    	  getOpportunityUI().setSpendingLimitOfPlayer(2, p2.getSpendingLimit());
		}
	}
}
