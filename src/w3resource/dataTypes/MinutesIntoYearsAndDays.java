package w3resource.dataTypes;

import java.util.Scanner;

public class MinutesIntoYearsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minutes :");
        long minutes = scanner.nextLong();
        int days = (int) (minutes/1440);
        int years = (int)(days/365);
        System.out.println( minutes + "minutes is approximately "
                            + years + " years and "
                            + (days-(years*365))+ " days");
    }
}
