// package GreedyApproach;

// import java.util.*;

// class Activity {
//     int start, end;
//     Activity(int s, int e) {
//         start = s;
//         end = e;
//     }
// }

// public class ActivitySelectionProblem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Activity[] activities = new Activity[n];
//         for (int i = 0; i < n; i++) {
//             int start = sc.nextInt();
//             int end = sc.nextInt();
//             activities[i] = new Activity(start, end);
//         }

//         Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

//         int count = 1;
//         int lastEnd = activities[0].end;

//         for (int i = 1; i < n; i++) {
//             if (activities[i].start >= lastEnd) {
//                 count++;
//                 lastEnd = activities[i].end;
//             }
//         }

//         System.out.println(count);
//     }
// }

package GreedyApproach;

import java.util.*;

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            activities[i][0] = sc.nextInt();
            activities[i][1] = sc.nextInt();
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int lastEnd = activities[0][1];

        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEnd) {
                count++;
                lastEnd = activities[i][1];
            }
        }

        System.out.println(count);
    }
}