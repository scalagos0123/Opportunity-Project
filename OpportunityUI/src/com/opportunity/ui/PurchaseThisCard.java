package com.opportunity.ui;
import java.util.ArrayList;
import javax.swing.JComponent;
import com.opportunity.ui.*;

public class PurchaseThisCard extends ClickAction {
	public PurchaseThisCard(JComponent source) {
		super(source);
	}
	
	public PurchaseThisCard(ArrayList<JComponent> sources) {
		super(sources);
	}

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		Player p1 = (Player) this.getYourGameData().get(0);
		Player p2 = (Player) this.getYourGameData().get(1);
		
		for (int i = 0; i < 5; i++) {
			getOpportunityUI().getInvestmentCardOfPlayer(1, i);
		}
	}

}
