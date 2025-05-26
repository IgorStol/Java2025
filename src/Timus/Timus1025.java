package timus;
import java.util.Arrays;
import java.util.Scanner;

public class Timus1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] voters = new int[n];
        for (int i = 0; i < n; i++) {
            voters[i] = sc.nextInt();
        }
        Arrays.sort(voters);
        int regionsNeeded = n / 2 + 1;
        int votes = 0;
        for (int i = 0; i < regionsNeeded; i++) {
            votes += voters[i] / 2 + 1;
        }
        System.out.println(votes);
    }
}
