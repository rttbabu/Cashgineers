package tests;

import services.BankingService;
import java.math.BigDecimal;

public class BankingServiceTest {
    public static void main(String[] args) {
        // Create an instance of the BankingService
        BankingService bankingService = new BankingService();

        // Test data
        int fromUserId = 1;
        int toUserId = 2;
        BigDecimal amount = new BigDecimal("250.00");

        // Test the sendMoney method
        boolean result = bankingService.sendMoney(fromUserId, toUserId, amount);

        // Print the result
        if (result) {
            System.out.println("sendMoney test passed: Money sent successfully.");
        } else {
            System.out.println("sendMoney test failed: Money transfer failed.");
        }
    }
}