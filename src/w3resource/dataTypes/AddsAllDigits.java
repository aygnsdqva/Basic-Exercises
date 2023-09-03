package w3resource.dataTypes;

import java.util.Scanner;

public class AddsAllDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 0 and 1000: ");
        int number = scanner.nextInt();
        String digits = String.valueOf(number);
        int sum = 0;
        if(number>1000 || number < 0){
            System.out.println("Number must be between 0 and 1000");
        } else{

            for (int i = 0; i < digits.length(); i++) {
                int digit = digits.charAt(i) - '0';
                sum += digit;
            }
            System.out.println("All digits sum = " + sum);
        }


    }
}
