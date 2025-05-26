package timus;
import java.util.Scanner;

public class Timus1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
        while (t-- > 0) {
            String pos = sc.next();
            int x = pos.charAt(0) - 'a' + 1;
            int y = pos.charAt(1) - '0';
            int count = 0;
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) count++;
            }
            System.out.println(count);
        }
    }
}

