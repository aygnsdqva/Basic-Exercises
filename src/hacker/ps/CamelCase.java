package hacker.ps;

import java.io.IOException;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = result(s);
    }
    public static int  result(String s) {
        int result =0;

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(ch.isUpperCase(s.charAt(i))) {
                result++;
            } }

        System.out.println(result+1);


        return result;
    }
}
