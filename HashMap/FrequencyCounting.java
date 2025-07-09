import java.util.HashMap;
import java.util.Scanner;
public class FrequencyCounting {
    public static boolean findPairWithSum(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = sum - num;
            if (map.containsKey(complement)) {
                return true; 
            }
            map.put(num, 1); 
        }
        return false;
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
