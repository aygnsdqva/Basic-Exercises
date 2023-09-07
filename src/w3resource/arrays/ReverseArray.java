package w3resource.arrays;

import java.util.Scanner;

public class ReverseArray {
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
        int j = (n-1);
        int newArr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
           newArr[i] = arr[j];
           j--;
        }
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
