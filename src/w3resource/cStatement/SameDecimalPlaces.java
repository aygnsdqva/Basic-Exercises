package w3resource.cStatement;

import java.util.Scanner;

public class SameDecimalPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Floating Number:");
        float x1 = scanner.nextFloat();

        System.out.println("Second Floating Number:");
        float x2 = scanner.nextFloat();

        String s1= String.valueOf(x1).substring(0,2);
        String s2= String.valueOf(x2).substring(0,2);

        if(Integer.valueOf(s1)==Integer.valueOf(s2)){
            System.out.println("Is Equal");
        }else {
            System.out.println("Is Different");
        }


    }
}
