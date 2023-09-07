package w3resource.method;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();

        System.out.println("Please enter second number : ");
        int b = scanner.nextInt();

        System.out.println("Please enter last number : ");
        int c = scanner.nextInt();

        System.out.println(biggestNum(a,b,c));
    }

    public  static int biggestNum(int a,int b, int c){
        int biggest = 0;
        if(a>b || a==b){
            biggest = a;
        }else {
            biggest=b;
        }

        if(c>biggest){
            biggest = c;
        }
        return  biggest;
    }
}
