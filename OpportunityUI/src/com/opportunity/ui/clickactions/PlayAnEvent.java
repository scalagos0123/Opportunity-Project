package com.opportunity.ui.clickactions;

import java.util.ArrayList;

import javax.swing.JComponent;

import com.opportunity.ui.ClickAction;
import com.opportunity.ui.OpportunityUI;

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
		getOpportunityUI().getCardImageOfBlowUpCard();
	}

}
