package w3resource.dataTypes;

import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int first = scanner.nextInt();

        System.out.println("Enter second integer:");
        int second = scanner.nextInt();

        System.out.println("Sum of two integers: " + (first+ second));
        System.out.println("Difference of two integers: " + Math.abs(first-second));
        System.out.println("Product of two integers: " + first*second);
        System.out.println("Average of two integers: " + (double)((first+second)/2));
        System.out.println("Max integer: " +  Math.max(first,second));
        System.out.println("Min integer: " + Math.min(first,second));


    }
}
