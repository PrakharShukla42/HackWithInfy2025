package GreedyApproach;

import java.util.*;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        Arrays.sort(coins);

        int count = 0;
        System.out.println("Coins used:");
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
                System.out.print(coins[i] + " ");
            }
        }

        System.out.println("\nMinimum coins needed: " + count);
    }
}
