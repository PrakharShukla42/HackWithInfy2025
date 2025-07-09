import java.util.*;
public class FirstNonRepeating {
    public static int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
       
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        
        return -1; 
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
        
        int result = firstNonRepeating(arr);
        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
        
        sc.close();
    }
}
