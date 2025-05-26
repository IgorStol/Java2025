package timus;
import java.util.Scanner;

public class Timus1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(10);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int d = 9; d >= 2; d--) {
            while (n % d == 0) {
                sb.insert(0, d);
                n /= d;
            }
        }
        if (n > 1) {
            System.out.println(-1);
        } else {
            System.out.println(sb.toString());
        }
    }
}
