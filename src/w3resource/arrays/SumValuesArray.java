package w3resource.arrays;

import java.util.Scanner;

public class SumValuesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length :");
        int n = scanner.nextInt();

        System.out.println("Enter number arrays:");
        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + " element:");
            arr[i] = scanner.nextLong();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
