package w3resource.method;

import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = scanner.nextInt();
        pentagonalNumbers(n);
    }
    public  static void  pentagonalNumbers(int n){
        int pentagonal;
        int[] arr = new int[n-1];
        for (int i = 1; i < n; i++) {
            pentagonal= (int)((3*Math.pow(i,2)-i)/2);
            arr[i-1] = pentagonal;
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }
    }
}
