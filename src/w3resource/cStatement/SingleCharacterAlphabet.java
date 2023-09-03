package w3resource.cStatement;

import java.util.Scanner;

public class SingleCharacterAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter single character :");

        String line = scanner.next();
        char character;

        if(line.length() > 1 ){
            System.out.println("Invalid Input");
        } else if(line.length()==0){
            System.out.println("Invalid Input");
        }else {
            character = line.charAt(0);
            if (isVowel(character)){
                System.out.println(character + " is vowel");
            } else if (isConsonant(character)) {
                System.out.println(character + " is consonant");
            } else {
                System.out.println(character + " is not a character");
            }
        }


    }
    public  static  boolean isVowel(char c){
        return  "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }
    public  static  boolean isConsonant(char c){
        return  "bcdfghjklmnpqrstvwxyz".indexOf(Character.toLowerCase(c)) != -1;
    }
}
