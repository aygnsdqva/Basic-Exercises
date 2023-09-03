package w3resource.dataTypes;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Inches:");
        int x = scanner.nextInt();
        double y = (double) (x * 0.0254);
        System.out.println("Meters =" + y + "m");

    }
}
