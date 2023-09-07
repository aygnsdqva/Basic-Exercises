package w3resource.arrays;

import java.util.Scanner;

public class RemoveSpecificElement {
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
        removeSpecific(arr,specific);

    }
    public static  void  removeSpecific(long[] arr , long specific){
        int index = -1;
        long[] otherArr = new long[arr.length -1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == specific){
                index = i;
                System.out.println("\"" + arr[i] + "\"" + " number in the " + i + " index should be removed!" );
                break;
            }
        }
        if (index == -1) {
            System.out.println("Item not found");
            return;
        }
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if ( i != index){
                otherArr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < otherArr.length; i++) {
            System.out.print(otherArr[i] + " ");
        }
    }
}
