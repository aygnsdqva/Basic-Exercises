package hacker.string;
import java.util.Locale;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        s= s.toLowerCase(Locale.ROOT);
        int count = 26;
        String alfabey = "abcdefghijklmnopqrstuvwxyz";

        for (int j = 0; j < alfabey.length(); j++) {
                String symbol = String.valueOf(alfabey.charAt(j));
                if(s.contains(symbol)) {
                    count--;
                }
        }

        if(count>0){
            System.out.println("not pangram");
        } else if (count==0) {
            System.out.println("pangram");
        }
    }
}

