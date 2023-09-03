package w3resource.cStatement;

import java.util.Scanner;

public class SumOfArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter n value :");

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter array " + i + " value: ");
            arr[i] = scanner.nextInt();
        }
        long  sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println("sum of arr is " + sum);
    }
}
