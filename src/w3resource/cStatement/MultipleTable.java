package w3resource.cStatement;


import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num :");
        int a = scanner.nextInt();

        System.out.println("Enter last num :");
        int b = scanner.nextInt();

        for (long i = 1; i <=a; i++) {
            System.out.println(i + " multiple table : ");
            for (long j = 0; j <= b; j++) {
                System.out.println( i + " x " + j + " = " + (i*j) );
            }
            System.out.println();
        }
    }
}
