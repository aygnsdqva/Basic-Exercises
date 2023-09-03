package w3resource.cStatement;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter month number :");
        int number = scanner.nextInt();

        System.out.println("Please enter year :");
        int year = scanner.nextInt();

        int localYear = LocalDate.now().getYear();

        if(number < 0 || year < 0 || number > 12 || year > localYear){
            System.out.println("Invalid Input!");
        }

        Month month =  Month.of(number);
        System.out.println("Month is " + month);
        YearMonth yearMonth = YearMonth.of(year,month);
        int daysOfMonth = yearMonth.lengthOfMonth();
        System.out.println(month + " " +  year + " has " + daysOfMonth + " days");


    }
}
