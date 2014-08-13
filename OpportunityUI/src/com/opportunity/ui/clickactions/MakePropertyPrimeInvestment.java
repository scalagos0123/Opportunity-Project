package com.opportunity.ui.clickactions;
import java.util.ArrayList;

import javax.swing.JComponent;

import com.opportunity.ui.ClickAction;
import com.opportunity.ui.Player;

public class MakePropertyPrimeInvestment extends ClickAction {

	public MakePropertyPrimeInvestment(JComponent source) {
		super(source);
	}
	
	public MakePropertyPrimeInvestment(ArrayList<JComponent> sources) {
		super(sources);
	}

	@Override
	public void mouseClicked() {
		if (this.getYourGameData().get(0) instanceof Player) {
			Player p1 = (Player) this.getYourGameData().get(0);
			getOpportunityUI().setMoneyOfPlayer(p1.getPlayerNum(), p1.getMoney() - );
			getOpportunityUI().setCardImageOfPrimeInvestmentCard(p1.getPlayerNum(), getOpportunityUI().getCurrentSelectedCard());
		}
	}
}
