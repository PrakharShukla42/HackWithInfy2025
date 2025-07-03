package GreedyApproach;

import java.util.*;

public class FabonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        
        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);
        
        while (fib.get(fib.size() - 1) <= k) {
            int size = fib.size();
            fib.add(fib.get(size - 1) + fib.get(size - 2));
        }
        
        int count = 0;
        int i = fib.size() - 1;

        while (k > 0) {
            if (fib.get(i) <= k) {
                k -= fib.get(i);
                count++;
            }
            i--;
        }
        if (k < 0) {
            System.out.println("Not possible to form the sum with Fibonacci numbers.");
            return;
        }
        System.out.println("Minimum number of Fibonacci numbers required: " + count);
    }
}
