package GreedyApproach;

import java.util.*;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not enough chocolates to buy two.");
            return;
        }

        int[] prices = new int[n];

        System.out.println("Enter the cost of chocolates :");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.print("Enter the money you have: ");
        int money = sc.nextInt();

        int min1 = 101;
        int min2 = 101;

        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }

        int diff = money - min1 - min2;

        if (diff >= 0) {
            System.out.println("Remaining money after buying two chocolates: " + diff);
        } else {
            System.out.println("Not enough money to buy two chocolates.");
        }
    }
}
