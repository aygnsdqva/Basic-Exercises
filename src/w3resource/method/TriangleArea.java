package w3resource.method;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Side 1 :");
        double side1 = scanner.nextDouble();

        System.out.println("Input Side 2 :");
        double side2 = scanner.nextDouble();

        System.out.println("Input Side 3 :");
        double side3 = scanner.nextDouble();

        System.out.println(triangleArea(side1,side2,side3));
    }
    public  static  double triangleArea(double side1, double side2, double side3){
        double s = ((side1 + side2 + side3)/2);
        double square = ( s *(s - side1)*(s - side2)*(s - side3));
        double A = Math.sqrt(square);
        return  A;
    }
}
