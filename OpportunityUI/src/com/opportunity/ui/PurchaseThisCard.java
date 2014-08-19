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
		
		if (Player.TURN == 0) {
		//getOpportunityUI().setCardImageOfInvestmentCard(1, 1, 3);
		getOpportunityUI().getInvestmentCardOfPlayer(1, 1).setImage(getOpportunityUI()
				.getCardImageLoader().getLargeImageIconFor(getOpportunityUI().getCardImageOfBlowUpCard()));
		}
	}
}
