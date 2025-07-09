import java.util.HashSet;
import java.util.Scanner;
public class MappingRelationships {
    public static boolean findPairWithSum(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(sum - num)) {
                return true; // Found a pair
            }
            set.add(num);
        }
        return false; // No pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int sum = sc.nextInt();
        
        boolean result = findPairWithSum(arr, sum);
        if (result) {
            System.out.println("There are two numbers in the array that add up to " + sum);
        } else {
            System.out.println("No two numbers in the array add up to " + sum);
        }
        
        sc.close();
    }
    
}
