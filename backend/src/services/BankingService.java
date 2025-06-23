package services;

import java.math.BigDecimal;

public class BankingService {

    // Method to request money from another user
    public boolean requestMoney(int fromUserId, int toUserId, BigDecimal amount) {
        System.out.println("Requesting " + amount + " from user " + fromUserId + " to user " + toUserId);
        return true;
    }

    // Method to show the balance of a user
    public BigDecimal showBalance(int userId) {
        BigDecimal balance = new BigDecimal("1000.00");
        System.out.println("Balance for user " + userId + " is " + balance);
        return balance;
    }

    // Method to send money to another user
    public boolean sendMoney(int fromUserId, int toUserId, BigDecimal amount) {
        System.out.println("Sending " + amount + " from user " + fromUserId + " to user " + toUserId);
        return true;
    }
}