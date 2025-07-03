package GreedyApproach;
import java.util.Scanner;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]); 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter array elements (non-negative integers):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < 0) {
                System.out.println("Invalid input. Only non-negative integers allowed.");
                return;
            }
        }

        boolean result = canJump(nums);
        System.out.println(result 
            ? "You can reach the last index." 
            : "You cannot reach the last index.");
    }
}
