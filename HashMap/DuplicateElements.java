import java.util.HashSet;
import java.util.Scanner;
public class DuplicateElements {
    public static boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
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
        boolean result = hasDuplicate(arr);
        if (result) {
            System.out.println("The array contains duplicate elements.");
        } else {
            System.out.println("The array does not contain duplicate elements.");
        }
        
        sc.close();
    }
    
}
