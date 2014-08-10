package com.opportunity.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.opportunity.ui.interfaces.OpportunityUICompatible;
/**
 * 
 * @author Shaun Calagos
 * @author Kat Delfin
 *
 */

public class Player extends ClickAction implements OpportunityUICompatible{
	
    private String player;
    private int cardAtHand;
    private int money;
    private Scanner sc;
    private Deck d;
    
    
    /**
     * sets up new Player Name, with starting money of $4000
     * @param player player name
     * 
     * 
     */
    
    public Player(String player) {
    	super();
    	this.sc = new Scanner (System.in);
    	this.d = new Deck();
        this.player = player;
        this.money = 1000;
        this.cardAtHand = 0;
        this.d = new Deck();
    }
    
    /**
     * returns the player name.
     * @return Player Name 
     */
    
    public String getPlayer() {
        return player;
    }

    public int getCardAtHand() {
    	return cardAtHand;
    }
    /**
     * returns the current money of the current player
     * @return Current player money 
     */
    
    public int getMoney() {
        return money;
    }

    /**
     * sets the Player name
     * @param player Player name 
     */
    
    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * sets the cards at hand of player.
     * @param cardAtHand Cards
     */
    
    public void setCardAtHand(int cardAtHand) {
        this.cardAtHand = cardAtHand;
    }

    /**
     * sets the current money of player.
     * @param money Money
     * @return 
     */
    
    public int setMoney(int money) {
        return this.money = money;
    }
    
    /**
     * Method for computing the current money left if the player wants to draw a card.
     * There's a 10% chance of getting 2 cards in 1 turn.
     */
    
//    public void investOnOpportunity() {
//        this.money = setMoney(getMoney() - 1000);
//        int chance = (int) (Math.random()*100);
//        int cardAtHand = this.cardAtHand;
//        
//        if (chance == 10) {
//        	cardAtHand++;
//            cardAtHand++;
//            setCardAtHand(cardAtHand);
//            chance = 0;
//        } else {
//            cardAtHand++;
//            setCardAtHand(cardAtHand);
//            chance = 0;
//        }
//        
//    }
    
    public void investOnOpportunity() {
        this.money = this.money - 1000;
        double chance = Math.random();
        
        if (chance < 0.1) {
        	this.cardAtHand = this.cardAtHand + 2;
        } else {
        	this.cardAtHand = this.cardAtHand + 1;
        }
        
        chance = 0;
        
    }
    
    public void instantOpportunity () {
    	this.money = this.money - 2000;
    	double chance = Math.random();
    	
    	if (chance < 0.1) {
    		this.cardAtHand = this.cardAtHand + 3;
    		
    	} else {
    		this.cardAtHand = this.cardAtHand + 2;
    	}
    	
		chance = 0;
    }
    
    public void alternativeOpportunity() {
    	this.cardAtHand = this.cardAtHand - 1;
    	double chance = Math.random();
    	
    	if (chance < 0.1) {
    		this.cardAtHand = this.cardAtHand + 2;
        } else {
        	this.cardAtHand = this.cardAtHand + 1;
        }
    	
        chance = 0;
    }
    
    public void playerTurn() {
    	String choice = "0";
    	while (!choice.equals("2")) {
    	
    	System.out.println("******** OPPORTUNITY ********");         //from here
        System.out.println("Player " + getPlayer() + " currently has : ");  
        System.out.println(" " + getCardAtHand()+ " cards in hand."); 
        System.out.println(" PhP " + getMoney()); 
        
		System.out.println("What would you like to do?"); 
		System.out.println(" 1 - Invest in opportunity"); 
		System.out.println(" 2 - End turn "); 
		choice = sc.next();
		
		if (choice.equals("2")) {
			choice = "";
			System.out.println("What kind of ending turn do you want?");
			System.out.println(" 1 - End turn");
			System.out.println(" 2 - Abstain Turn");
			choice = sc.next();
			
			if (choice.equals("1")) {
				endTurn();
				choice = "2";
			} else if (choice.equals("2")) {
				abstainTurn();
				choice = "2";
			}
			
		} else if (choice.equals("1")){
			choice = "";
			System.out.println("What kind of investment do you want? ");
			System.out.println("1 - Instant");
			System.out.println("2 - Alternative");
			System.out.println("3 - Invest");
			
			choice = sc.next();
			
			if (choice.equals("1")) {
				instantOpportunity();
				choice = "0";
			} else if (choice.equals("2")) {
				alternativeOpportunity();
				choice = "0";
			} else if (choice.equals("3")) {
				investOnOpportunity();
				choice = "0";
			} else {
				System.out.println("Invalid input. Try again");
			}
		}
		
    	}
    }
    
    public boolean endTurn() {
    	int cardAtHand = this.cardAtHand;
    	
    	while (cardAtHand > 7) {
			if (cardAtHand > 7) {
				cardAtHand--;
			} else {
				
			}
		}
    	
    	setCardAtHand(cardAtHand);
    	return true;
    }
    
    public boolean abstainTurn() {
    	int cardAtHand = this.cardAtHand;
    	
    	while (cardAtHand > 7) {
			if (cardAtHand > 7) {
				cardAtHand--;
			} else {
				
			}
		}
    	
    	setMoney(getMoney() + 3000);
    	return true;
    }
    
    public void playAnEvent() {
    	
    }

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		
	}
}