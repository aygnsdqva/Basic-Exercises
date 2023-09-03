package w3resource.cStatement;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("It is Negative");
        }else {
            System.out.println("It is Positive");
        }
    }
}
