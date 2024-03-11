package com.learning.core.day4;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        this.coins = calculateCoins();
    }

    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        this.coins = calculateCoins();
    }
    
    public String getCoins() {
    	return this.coins;
    }

    public void calculateAverageRating(float critic1, float critic2) {
        this.avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() {
        if (avgRating >= 7) {
            return "gold";
        } else if (avgRating >= 5 && avgRating < 7) {
            return "silver";
        } else if (avgRating >= 2 && avgRating < 5) {
            return "copper";
        } else {
        	return "Not eligible";
        }
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        System.out.println("Coins: " + coins);
    }

}

class D04P02{
	 public static void main(String[] args) {
	        CricketRating player1 = new CricketRating("Player 1", 8.5f, 7.0f, 9.0f);
	        player1.display();

	        CricketRating player2 = new CricketRating("Player 2", 6.0f, 5.5f);
	        player2.display();

	        CricketRating player3 = new CricketRating("Player 3", 3.5f, 4.0f, 2.0f);
	        player3.display();

	        try {
	            CricketRating player4 = new CricketRating("Player 4", 1.5f, 1.0f);
	            player4.display();
	            if(player4.getCoins() == "Not eligible"){
	            	throw new NotEligibleException("Not eligible"); 
	            }
	        } catch (NotEligibleException e) {
	            System.out.println("Player 4 is not eligible for coins: " + e.getMessage());
	        }
	 }
}