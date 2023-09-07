package w3resource.method;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num: ");
        int n = scanner.nextInt();
        System.out.println(sumDigits(n));

    }

    public static long sumDigits(int n){
        long sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
          sum+=(s.charAt(i) - '0');
        }


        return  sum;
    }
}
