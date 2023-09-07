package w3resource.method;

import java.util.Scanner;

public class LegalPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password : ");
        String password = scanner.next();
        isLegal(password);

    }
    public  static  void isLegal(String password){
        if(password.length()<8){
            System.out.println("A password must have at least eight characters");
            System.exit(0);
        }
        int counter = 0;
        int digitsCounter = 0;
        char[]  ch = password.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(!Character.isLetterOrDigit(ch[i])){
                counter++;
            }
            if(Character.isDigit(ch[i])){
                digitsCounter++;
            }
        }
        if(counter!=0){
            System.out.println("A password consists of only letters and digits");
            System.exit(0);
        }
        if(digitsCounter<2){
            System.out.println("A password must contain at least two digits");
            System.exit(0);
        }

        System.out.println("Your password is valid " + password);




    }
}
