package hacker.interview.month;

import java.util.Scanner;

public class Daysof0HelloWorld {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                // Read a full line of input from stdin and save it to our variable, inputString.
                String inputString = scan.nextLine();

                // Close the scanner object, because we've finished reading
                // all of the input from stdin needed for this challenge.
                scan.close();

                // Print a string literal saying "Hello, World." to stdout.
                System.out.println("Hello, World.");
                System.out.println(inputString);

            }
        }



