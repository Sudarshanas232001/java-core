package com.learning.day4;
import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (accType.equals("savings") && initialBalance < 1000) {
            throw new LowBalanceException("Minimum balance for savings account is 1000");
        } else if (accType.equals("current") && initialBalance < 5000) {
            throw new LowBalanceException("Minimum balance for current account is 5000");
        }
        if (initialBalance < 0) {
            throw new NegativeAmountException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative");
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equals("savings")) {
            throw new LowBalanceException("Balance is below minimum for savings account");
        } else if (balance < 5000 && accType.equals("current")) {
            throw new LowBalanceException("Balance is below minimum for current account");
        }
        return balance;
    }
}

public class D04P01{
    public static void main(String[] args) {
        try {
        	Scanner sc = new Scanner(System.in);
        	int accNo;
        	String custName;
        	String accType;
        	float balance;
        	
        	accNo = sc.nextInt();
        	custName = sc.next();
        	accType = sc.next();
        	balance = sc.nextFloat();
        	
        	BankAccount account = new BankAccount(accNo, custName, accType, balance);
        	
        } 
        catch (LowBalanceException e) {
            System.out.println("Low Balance Exception: " + e.getMessage());
        } 
        catch (NegativeAmountException e) {
            System.out.println("Negative Amount Exception: " + e.getMessage());
        }
    }
}