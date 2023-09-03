package w3resource.cStatement;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a number : ");
        int a = scanner.nextInt();

        System.out.println("Please Enter b number : ");
        int b = scanner.nextInt();

        System.out.println("Please Enter c number : ");
        int c = scanner.nextInt();

        double D = (Math.pow(b,2) - 4*a*c);
        double x1;
        double x2;

        if(D>0){
           x1 = (-b + Math.sqrt(D))/(2*a);
           x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("D is bigger than zero & x1= " + x1 + "; x2= " + x2 );
        } else if (D==0) {
            x1 = (-b/(2*a));
            x2=x1;
            System.out.println("D is equal  zero & x1= " + x1 + "; x2= " + x2 );
        }else {
            System.out.println("D is smaller than zero & x1= ");

        }
    }
}
