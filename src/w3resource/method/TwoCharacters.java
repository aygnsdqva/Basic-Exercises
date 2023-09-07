package w3resource.method;

import java.util.Scanner;

public class TwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        characterBetween('(', 'z',n);


    }

    public  static  void characterBetween(char start, char end, int n){
        int counter = 0;
        for (char c = start; c <= end ; c++) {
            System.out.print(c + " ");
            counter++;
            if(counter==n){
                System.out.println();
                counter = 0;
            }
        }

    }
}
