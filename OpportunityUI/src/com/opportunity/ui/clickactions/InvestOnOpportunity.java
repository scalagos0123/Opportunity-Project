package com.opportunity.ui.clickactions;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.swing.JComponent;

import com.opportunity.ui.ClickAction;
import com.opportunity.ui.Player;

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
			
			getOpportunityUI().setSpendingLimitOfPlayer(p1.getPlayerNum(), p1.getMoney() - 1000);
			double chance = Math.random();
		
		      if (chance < 0.1) {
		    	  p1.getCardFromDeck();
		    	  p1.getCardFromDeck();
		    	  getOpportunityUI().setDeckCardCountOfPlayer(p1.getDeckSize(), p1.getPlayerNum());
		      } 
		      
		      } else if (get)
		    	  
		}
	}
}
