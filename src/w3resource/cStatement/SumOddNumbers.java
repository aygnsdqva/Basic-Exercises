package w3resource.cStatement;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter beginning range :");
        int  begin = scanner.nextInt();

        System.out.println("Please enter last range :");
        int last = scanner.nextInt();

        long sum = 0;

        for (int i = begin; i <= last ; i++) {
            if(i%2 != 0){
                sum += i;
            }
        }
        if(sum == 0){
            System.out.println("There is not odd number in this range!");
        }else {
            System.out.println("Odd number sum is " + sum);
        }


    }
}
