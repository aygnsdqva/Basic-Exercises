package w3resource.cStatement;

import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        if(a>b && b>c){
            System.out.println("Decreasing order");
        } else if (c>b && b>a) {
            System.out.println("Increasing order");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
