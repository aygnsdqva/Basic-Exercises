package w3resource.cStatement;

import java.util.Scanner;

public class CubeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");

        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Number is : " + i + "and cube of " + i + " is : " + (int)(Math.pow(i,3)));
        }

    }
}
