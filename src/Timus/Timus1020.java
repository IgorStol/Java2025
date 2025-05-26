package timus;
import java.util.Scanner;

public class Timus1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = sc.nextDouble();
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
        double length = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            double dx = x[i] - x[j];
            double dy = y[i] - y[j];
            length += Math.hypot(dx, dy);
        }
        length += 2 * Math.PI * r;
        System.out.printf("%.2f\n", length);
    }
}
