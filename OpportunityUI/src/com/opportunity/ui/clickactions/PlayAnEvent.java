package com.opportunity.ui.clickactions;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.opportunity.ui.CardImageLoader;
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
		Player p1 = (Player) this.getYourGameData().get(0);
		Player p2 = (Player) this.getYourGameData().get(1);
		
		if (this.getYourGameData().get(0) instanceof Player) {
			if (getOpportunityUI().getCardImageOfBlowUpCard() == CardImageLoader.BIR_HUNTING_BEGINS) {
				
				System.out.println(getOpportunityUI().getInvestmentsOfPlayer(1));
				
				//getOpportunityUI().setMoneyOfPlayer(1, );
			}
			
				
			}
		}
	}
	
