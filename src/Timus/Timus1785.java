package timus;

public class Timus1785 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n >= 1 && n <= 4) System.out.println("few");
        else if (n >= 5 && n <= 9) System.out.println("several");
        else if (n >= 10 && n <= 19) System.out.println("pack");
        else if (n >= 20 && n <= 49) System.out.println("lots");
        else if (n >= 50 && n <= 99) System.out.println("horde");
        else if (n >= 100 && n <= 249) System.out.println("throng");
        else if (n >= 250 && n <= 499) System.out.println("swarm");
        else if (n >= 500 && n <= 999) System.out.println("zounds");
        else System.out.println("legion");
    }
}