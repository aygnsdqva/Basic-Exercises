package w3resource.arrays;

import java.util.Scanner;

public class MaxAndMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array length: ");
        int n = scanner.nextInt();

        System.out.println("Please Fill Array Element :");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " elemet :");
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);


    }
}
