package w3resource.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length :");
        int n = scanner.nextInt();

        System.out.println("Enter number arrays:");
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + " element:");
            arr[i] = scanner.nextLong();
        }
        Object[] sArr = new String[n];

        System.out.println("Enter words array: ");
        for (int i = 0; i < sArr.length; i++) {
            System.out.println("Enter " + i + " element:");
            sArr[i] = scanner.next();
        }

        arr = Arrays.stream(arr).sorted().toArray();
        sArr = Arrays.stream(sArr).sorted().toArray();
        System.out.println("Number Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("String Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(sArr[i] + " ");
        }
    }
}
