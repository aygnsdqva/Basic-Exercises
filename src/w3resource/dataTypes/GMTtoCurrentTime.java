package w3resource.dataTypes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class GMTtoCurrentTime {

    //Review Again !!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the time zone offset to GMT");
        int minutes = scanner.nextInt();
        int hours = minutes/60;
        int seconds = minutes%60;

        TimeZone timeZone = TimeZone.getTimeZone(String.format("GMT+%d:%02d",hours,seconds));

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(timeZone);

        Calendar calendar = Calendar.getInstance(timeZone);

        System.out.println(sdf.format(calendar.getTime()));
    }
}
