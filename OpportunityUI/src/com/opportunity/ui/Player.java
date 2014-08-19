package com.opportunity.ui;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComponent;
import com.opportunity.ui.interfaces.OpportunityUICompatible;
import com.opportunity.ui.*;
/**
 * 
 * @author Shaun Calagos
 * @author Kat Delfin
 *
 */

public class Player implements OpportunityUICompatible {
	
    private String player;
    private int playerNum;
    private double money;
    private double spendingLimit;
    private ArrayList<Cards> cardsOnHand;
    private ArrayList<Card> investmentSlot;
    private Deck deck;
    public static int TURN = 0;
    
    
    public Player(String player, int playerNum) {
    	this.cardsOnHand = new ArrayList<Cards>();
    	this.investmentSlot = new ArrayList<Card>();
        this.player = player;
        this.money = 10000;
        this.deck = new Deck();
        this.playerNum = playerNum;
        this.spendingLimit = 0;
    }
    
    public String getPlayer() {
        return player;
    }
    
    public double getMoney() {
        return money;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public double setMoney(double money) {
        return this.money = money;
    }
    
    public void getCardsOnHand(int index) {
    	cardsOnHand.add(deck.getCard());
    	
    }
    
    public Cards removeCardOnHand(int cardToBeRemoved) {
    	return cardsOnHand.remove(cardsOnHand.indexOf(cardToBeRemoved));
    }

	public int getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	
	public Cards getCardFromDeck() {
		return deck.getCard();
	}
	
	public int getDeckSize() {
		return deck.getDeckCount();
	}
	
	public void removeCardFromDeck() {
		deck.removeCardOnDeck();
	}
	
	public void shuffleDeck() {
		deck.shuffle();
	}

	public double getSpendingLimit() {
		return spendingLimit;
	}

	public void setSpendingLimit(double spendingLimit) {
		this.spendingLimit = spendingLimit;
	}
	
	public void addToList(Card cardFromInvestment) {
		investmentSlot.add(cardFromInvestment);
	}
	
	public void getCardFromList(int index) {
		investmentSlot.get(index);
	}
	
//	public ArrayList<Card> getInvestmentSlot() {
//		return investmentSlot;
//	}
//
//	public void setInvestmentSlot(ArrayList<Card> investmentSlot) {
//		this.investmentSlot = investmentSlot;
//	}
	
//	public int getTurn() {
//		return TURN;
//	}
//	
//	public void setTurn(int playerTurnByNumber) {
//		TURN = playerTurnByNumber;
//	}
//	
//	public void incrementTurn() {
//		TURN++;
//	}
    
//    public void investOnOpportunity() {
//        this.money = this.money - 1000;
//        double chance = Math.random();
//        
//        if (chance < 0.1) {
//        	this.cardAtHand = this.cardAtHand + 2;
//        } else {
//        	this.cardAtHand = this.cardAtHand + 1;
//        }
//        
//        chance = 0;
//        
//    }
//    
//    public void instantOpportunity () {
//    	this.money = this.money - 2000;
//    	double chance = Math.random();
//    	
//    	if (chance < 0.1) {
//    		this.cardAtHand = this.cardAtHand + 3;
//    		
//    	} else {
//    		this.cardAtHand = this.cardAtHand + 2;
//    	}
//    	
//		chance = 0;
//    }
//    
//    public void alternativeOpportunity() {
//    	this.cardAtHand = this.cardAtHand - 1;
//    	double chance = Math.random();
//    	
//    	if (chance < 0.1) {
//    		this.cardAtHand = this.cardAtHand + 2;
//        } else {
//        	this.cardAtHand = this.cardAtHand + 1;
//        }
//    	
//        chance = 0;
//    }
    
    /* public void playerTurn() {
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
    	
    */
}