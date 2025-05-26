package timus;

import java.util.*;

public class task_1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] stones = new int[n];
        int totalWeight = 0;

        for (int i = 0; i < n; i++) {
            stones[i] = in.nextInt();
            totalWeight += stones[i];
        }
        in.close();

        int minDifference = Integer.MAX_VALUE;

        for (int mask = 0; mask < (1 << n); mask++) {
            int sumA = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sumA += stones[i];
                }
            }
            int sumB = totalWeight - sumA;
            minDifference = Math.min(minDifference, Math.abs(sumA - sumB));
        }

        System.out.println(minDifference);
    }
}
