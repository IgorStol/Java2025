package timus;

import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        int sum;
        if (N > 0) {
            sum = (N * (N + 1)) / 2;
        } else {
            sum = ((1 - N) * N) / 2 + 1;
        }

        System.out.println(sum);
    }
}
