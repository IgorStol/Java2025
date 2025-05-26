import java.util.Scanner;

public class Timus1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() / 2;
        int[] count = new int[9 * n + 1];
        count[0] = 1;
        for (int i = 0; i < n; i++) {
            int[] temp = new int[9 * n + 1];
            for (int j = 0; j <= 9 * i; j++) {
                for (int k = 0; k <= 9; k++) {
                    temp[j + k] += count[j];
                }
            }
            count = temp;
        }
        int result = 0;
        for (int c : count) {
            result += c * c;
        }
        System.out.println(result);
    }
}
