package GreedyApproach;
import java.util.Scanner;

public class DIStringMatch {
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low; 

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string of 'I' and 'D': ");
        String s = sc.nextLine();
        int[] result = diStringMatch(s);
        System.out.print("Resulting array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
