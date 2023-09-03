package w3resource.cStatement.doIt;

import java.util.Scanner;

public class PyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x = scanner.nextInt();

        for (int i = 1; i < x ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
