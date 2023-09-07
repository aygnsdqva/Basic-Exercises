package w3resource.method;

import java.util.Scanner;

public class AllVowelCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words :");
        String  s = scanner.next();
        if(isAllVowel(s)){
            System.out.println("All the characters of the \"" + s + "\" words are vowels" );
        }else {
            System.out.println("All the characters of the \"" + s + "\" words are not vowels" );
        }

    }
    public static  boolean isAllVowel(String s){
        int counter = 0;
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if ("aeuoi".indexOf(Character.toLowerCase(c)) < 0) {
                counter++;
            }
        }
        return counter == 0;
    }
}
