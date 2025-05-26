package timus;

public class Timus1409 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int harry = scanner.nextInt();
        int larry = scanner.nextInt();
        scanner.close();

        int total = harry + larry - 1;
        System.out.println((total - harry) + " " + (total - larry));
    }
}
