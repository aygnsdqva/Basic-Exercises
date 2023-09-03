package w3resource.cStatement;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Valid Year");
        int year = scanner.nextInt();
        if(year < 0 || year > LocalDate.now().getYear()){
            System.out.println("Invalid Year");
            System.exit(0);
        }

        boolean  isLeap = Year.isLeap(year);
        if(isLeap){
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year + " is not leap year");
        }

/*      Otherwise :
        int daysOfYear = Year.of(year).length();
        if(daysOfYear > 365){
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year + " is not leap year");
        }
*/
    }
}
