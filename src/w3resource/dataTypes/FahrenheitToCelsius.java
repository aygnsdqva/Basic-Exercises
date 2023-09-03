package w3resource.dataTypes;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit");
        int x = scanner.nextInt();
        System.out.println("Fahrenheit = " + x + " °F");
        double y = (double) ((x - 32) * 5) /9;
        System.out.println("Celsius = " + y + " °C");

    }
}
