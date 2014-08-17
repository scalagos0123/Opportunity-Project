package com.opportunity.ui.clickactions;
import java.util.ArrayList;
import javax.swing.JComponent;
import com.opportunity.ui.ClickAction;

public class EndTurn extends ClickAction {
	public EndTurn(JComponent source) {
		super(source);
	}
	
	public EndTurn(ArrayList<JComponent> sources) {
		super(sources);
	}

	@Override
	public void mouseClicked() {
		if (getOpportunityUI().getGameTable().getPlayer2Pane().isVisible() == false) {
			getOpportunityUI().getGameTable().getPlayer1Pane().setVisible(false);
			getOpportunityUI().getGameTable().getPlayer2Pane().setVisible(true);
		}
		
	}
}
