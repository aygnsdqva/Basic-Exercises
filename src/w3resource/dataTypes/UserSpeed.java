package w3resource.dataTypes;

import java.util.Scanner;

public class UserSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input distance in meters: ");
        int meters = scanner.nextInt();

        System.out.println("Input hours: ");
        int hours =  scanner.nextInt();

        System.out.println("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.println("Input seconds: ");
        int seconds = scanner.nextInt();

        double km = (double) meters /1000;
        double miles =  meters * 0.000621371;

        System.out.println("Your speed in meters/minutes is " + (meters/minutes));
        System.out.println("Your speed in km/h is " + (km/hours));
        System.out.println("Your speed in miles/second is " + (miles/seconds));
    }
}
