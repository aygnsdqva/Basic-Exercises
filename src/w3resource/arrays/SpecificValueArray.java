package w3resource.arrays;

import java.util.Scanner;

public class SpecificValueArray {
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
        System.out.println("Enter specific value : ");
        long specific = scanner.nextLong();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==specific){
                System.out.println(specific + " value  founded  in " + i + " index");
            }
        }


    }
}
