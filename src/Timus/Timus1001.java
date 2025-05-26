package timus;
import java.util.Scanner;
import java.util.ArrayList;

public class Timus1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        while (sc.hasNextLong()) {
            long num = sc.nextLong();
            numbers.add(Math.sqrt(num));
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", numbers.get(i));
        }
    }
}
