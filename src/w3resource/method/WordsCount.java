package w3resource.method;

import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentences : ");

        String s = scanner.nextLine();
        System.out.println(wordsCount(s));

    }
    public  static  int wordsCount(String s){
        String[] arr = s.split(" ");
        int count = arr.length;

        return  count;
    }
}
