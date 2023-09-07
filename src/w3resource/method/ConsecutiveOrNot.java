package w3resource.method;

import java.lang.instrument.ClassDefinition;
import java.util.Scanner;

public class ConsecutiveOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scanner.nextInt();

        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("Enter last number: ");
        int last = scanner.nextInt();

        if (isConsecutive(first,second,last)){
            System.out.println("Three said numbers are consecutive");
        }else{
            System.out.println("Three said numbers are not consecutive");
        }

    }

    public  static  boolean isConsecutive(int first, int second, int last){
        int smallest = first;
        int biggest = last;
        if(first == second || first == last || second == last){
            return  false;
        }
        if(smallest>second){
            smallest  = second;
            biggest = first;

        }
        if(smallest > last){
            smallest = last;

        }
        if(biggest < last){
            biggest = last;
        }
        if((smallest+2) != biggest){
            return  false;
        }

        return true;
    }
}
