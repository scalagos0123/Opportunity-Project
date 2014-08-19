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
		
		if (Player.TURN == 0) {
			if (getOpportunityUI().getCardImageOfBlowUpCard() == CardImageLoader.BIR_HUNTING_BEGINS) {
				
				double totalIncome = 0;
				
				for (int i = 6; i < 21; i++) { 
					for (int j = 0; j < 5; j++) {
				//if (getOpportunityUI().getInvestmentCardOfPlayer(1, j) == i) {
					
				}
				
				//getOpportunityUI().setMoneyOfPlayer(1, );
					}
				}
			}
			
				
			}
		}
	
