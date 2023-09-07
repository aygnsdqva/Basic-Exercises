package w3resource.method;

import java.util.Scanner;

public class EveryDigitIsOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        if(isOdd(num)){
            System.out.println("Every digit of the " + num +" number is odd ");
        }else {
            System.out.println("Every digit of the " + num + " number is not odd");
        }

    }

    public  static  boolean isOdd(int num){
        int counter = 0;
        char[] ch = String.valueOf(num).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if((ch[i] - '0') % 2 == 0){
                System.out.println(ch[i] + " isn't odd");
                counter++;
            }
        }
        if(counter > 0){
            return  false;
        }
        return true;
    }
}
