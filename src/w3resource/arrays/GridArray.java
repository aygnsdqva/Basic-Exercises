package w3resource.arrays;

import java.util.Scanner;

public class GridArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single character: ");
        String s = scanner.next();
        if(s.length()>1){
            System.out.println("Character must be single!!!");
            System.exit(0);
        }
        System.out.println("Enter wanted number :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(s);
                if(j!=(n-1)){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
