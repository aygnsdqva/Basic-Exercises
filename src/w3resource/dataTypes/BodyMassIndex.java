package w3resource.dataTypes;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input weight in pounds : ");
        int weight = scanner.nextInt();

        System.out.println("Input height in inches:");
        int height = scanner.nextInt();

        double weightWithKg = weight* 0.453592;
        double heightWithM = height*0.0254;

        double index = weightWithKg/Math.pow(heightWithM,2);

        System.out.println("Your Body Mass Index is " + index);


    }
}
