package com.opportunity.ui.clickactions;
import java.util.ArrayList;

import javax.swing.JComponent;

import com.opportunity.ui.*;
/* 
 * This class will allow the player to play an asset or property card from their hand by paying for the cost of the card. 
 * The player then places the card on their Investments space, which can hold up to five assets or properties. 
 * Cards in the Investments space can only earn the player the minimum amount of money they can earn as indicated on 
 * the property or asset card, no matSter how much they invest on them.
 * @ author Shaun Calagos and Katrina Delfin
 */
public class PurchaseAssetPropCard extends ClickAction{
	public PurchaseAssetPropCard(JComponent source) {
		super(source);
	}
	
	public PurchaseAssetPropCard(ArrayList<JComponent> sources) {
		super(sources);
	}
	
	public void mouseClicked(){ 
		// TODO Auto-generated method stub
		
		if(this.getYourGameData().get(0) instanceof Player){ 
			Player p1 = (Player)this.getYourGameData().get(0);
			
			Asset a = new Asset("Karen Dairy A", "Yay", 2000, 2000, 2000, 2000, 2000); 
			Property p = new Property(); 
			
			getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    p1.removeCardFromDeck();
		    getOpportunityUI().getGameTable().getPlayer1Pane().addCardToHand(p1.getCardFromDeck().getCardImage());
		    p1.removeCardFromDeck();
		    getOpportunityUI().setDeckCardCountOfPlayer(p1.getDeckSize(), p1.getPlayerNum());
		    getOpportunityUI().setSpendingLimitOfPlayer(p1.getPlayerNum(), p1.getMoney() - p.getCost());
		    
			
		} else { 
			
		}
	}
}
