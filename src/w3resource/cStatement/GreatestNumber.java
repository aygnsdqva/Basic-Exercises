package w3resource.cStatement;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();

        System.out.println("Please enter second number : ");
        int b = scanner.nextInt();


        System.out.println("Please enter last number : ");
        int c = scanner.nextInt();

        int biggest = 0;

        if(a>b || a==b){
            biggest = a;
        }else {
            biggest = b;
        }

        if(biggest < c){
            biggest = c;
        }
        System.out.println("Biggest Number is " + biggest);




    }
}
