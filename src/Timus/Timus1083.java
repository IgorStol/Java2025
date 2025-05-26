package timus;
import java.util.Scanner;

public class Timus1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int k = sc.next().length();
        int n = Integer.parseInt(input);
        int result = 1;
        for (int i = n; i > 0; i -= k) {
            result *= i;
        }
        System.out.println(result);
    }
}
