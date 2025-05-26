package lr1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input today's day of the week ");
        String weekday = in.nextLine();
        System.out.println("Input the name of the current month: ");
        String month = in.nextLine();
        System.out.println("Input the number of the day in the month today: ");
        int day_number = in.nextInt();
        System.out.printf("Today is: %s, %d of %s", weekday, day_number, month);
        in.close();
    }
}
