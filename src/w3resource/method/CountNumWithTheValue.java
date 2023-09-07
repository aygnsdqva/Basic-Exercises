package w3resource.method;

import java.util.Scanner;

public class CountNumWithTheValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = scanner.nextInt();

        System.out.println("Enter counting value : ");
        int value = scanner.nextInt();

        System.out.println(counterValue(num,value));

    }

    public  static  int counterValue(int num, int value){
        int counter = 0;

        char[] ch = String.valueOf(num).toCharArray();
        for (char c : ch) {
            if ((c - '0') == value) {
                counter++;
            }
        }
        return  counter;
    }
}
