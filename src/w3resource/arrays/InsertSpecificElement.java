package w3resource.arrays;

import java.util.Scanner;

public class InsertSpecificElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array length: ");
        int n = scanner.nextInt();

        System.out.println("Please Fill Array Element :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " elemet :");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter specific value :");
        int specific  = scanner.nextInt();

        System.out.println("Enter specific index");
        int index = scanner.nextInt();
        if(index>n){
            System.out.println(index + " is not valid");
            System.exit(0);
        }
        System.out.println("Old Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        System.out.println( "Number "+ "\"" + specific + "\"" + "  was added to the " + index + " index" );

        int newArray[] = new int[n+1];
        for (int i = 0; i < index; i++) {
            newArray[i]=arr[i];
        }
        newArray[index] = specific;

        int j = (index + 1);
        for (int i = index; i <arr.length ; i++) {
            newArray[j] = arr[i];
            j++;
        }

        System.out.println("New Array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
