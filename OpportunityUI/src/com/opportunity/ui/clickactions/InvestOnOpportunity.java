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
		getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		
		if (this.getYourGameData().get(0) instanceof Player) {
			//Player p1 = (Player) this.getYourGameData().get(0);
			//getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
			//getOpportunityUI().addCardToPlayerHand(p1.getPlayerNum(), p1.getCardFromDeck().getCardImage());
//			getOpportunityUI().setSpendingLimitOfPlayer(p1.getPlayerNum(), p1.getMoney() - 1000);
//			double chance = Math.random();
//		      if (chance < 0.1) {
//		    	  getOpportunityUI().addCardToPlayerHand(p1.getPlayerNum(), p1.getCardFromDeck());
//		    	  p1.getCardFromDeck();
//		    	  getOpportunityUI().setDeckCardCountOfPlayer(p1.getDeckSize(), p1.getPlayerNum());
//		    	  
//		      } 
//		      
//		      } else if (get)
//		    	  
		}
	}
}
