package w3resource.method;

import java.util.Scanner;

public class AvarageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();

        System.out.println("Please enter second number : ");
        int b = scanner.nextInt();

        System.out.println("Please enter last number : ");
        int c = scanner.nextInt();

        System.out.println(avarageNums(a,b,c));
    }
    public  static  double avarageNums(int a, int b, int c){
        double avarage = (a+b+c)/3;
        return  avarage;
    }
}
