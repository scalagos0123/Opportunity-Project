package com.opportunity.ui.clickactions;
import java.util.ArrayList;

import javax.swing.JComponent;

import com.opportunity.ui.ClickAction;
import com.opportunity.ui.Player;

public class EndTurn extends ClickAction {
	public EndTurn(JComponent source) {
		super(source);
	}
	
	public EndTurn(ArrayList<JComponent> sources) {
		super(sources);
	}

	@Override
	public void mouseClicked() {
		if (Player.TURN == 0) {
			Player.TURN++;
		} else if (Player.TURN == 1) {
			Player.TURN++;
		}
		
		if (Player.TURN == 2) {
//			boolean winner = computeSpendingLimit();
//			if (winner = true) {
//				
//			}
			Player.TURN = 0;
		}
		
		
	}
	
	public boolean computeSpendingLimit() {
		//getOpportunityUI().get
		return true;
	}
}
