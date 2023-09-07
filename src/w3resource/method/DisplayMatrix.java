package w3resource.method;

import java.util.Random;
import java.util.Scanner;

public class DisplayMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        int n = scanner.nextInt();
        displayMatrix(n);
    }
    public  static  void  displayMatrix(int n){
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(random.nextInt(2));
            }
            System.out.println();
        }
    }
}
