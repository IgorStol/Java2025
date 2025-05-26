package timus;

public class Timus1639 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        System.out.println((n * m) % 2 == 0 ? "[:=[first]" : "[second]=:]");
    }
}
