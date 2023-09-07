package w3resource.method;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int a = scanner.nextInt();
        middleCharacter(a);
    }
    public  static  void middleCharacter(int a){
        String s = String.valueOf(a);
        int middle = s.length()/2;

        if(s.length()%2 ==0){
            System.out.println("First middle = " + s.charAt(middle-1) +
                    " and second middle = " + s.charAt(middle));
        }else{
            System.out.println("Middle character is " + s.charAt(middle));
        }
    }
}
