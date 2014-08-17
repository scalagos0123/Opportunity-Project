package com.opportunity.ui.clickactions;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.opportunity.ui.ClickAction;
import com.opportunity.ui.OpportunityUI;
import com.opportunity.ui.Player;

public class PlayAnEvent extends ClickAction {
	
	public PlayAnEvent(JComponent source) {
		super(source);
	}

	public PlayAnEvent(ArrayList<JComponent> sources) {
		super(sources);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		if (this.getYourGameData().get(0) instanceof Player) {
			Player p1 = (Player) this.getYourGameData().get(0);
			getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
//			if (getOpportunityUI().getCardImageOfBlowUpCard() == 0) {
//				getOpportunityUI().getInvestmentCardOfPlayer(p1.getPlayerNum() );
//				getOpportunityUI().setMoneyOfPlayer(p1.getPlayerNum(), );
//				this.getYourGameData().get(0);
				
			}
		}
	}
	
