package w3resource.method;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String s =  scanner.next();

        System.out.println(countVowels(s));

    }

    public  static  int countVowels(String s){
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if ("aeuoi".indexOf(Character.toLowerCase(arr[i])) >= 0){
                count++;
            }
        }
        return count;
    }

}
