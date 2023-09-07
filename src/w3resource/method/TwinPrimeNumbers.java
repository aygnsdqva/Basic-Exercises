package w3resource.method;

import java.util.Scanner;

public class TwinPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter end range:");
        int end = scanner.nextInt();

        for (int i = 1; i <= end; i++) {
            if(isAsal(i) && isAsal(i+2)){
                System.out.println("(" + i + " " + (i+2) + ")");
            }
        }

    }
    public  static  boolean isAsal( int num){
        if(num <=1){
            return  false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i ==0){
                return  false;
            }
        }
        return  true;
    }


}
