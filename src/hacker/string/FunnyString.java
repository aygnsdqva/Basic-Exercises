package hacker.string;
import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            stringBuilder.append(s.charAt(i));
        }
        int[] a = new int[s.length()];
        int[] b = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int unicode1 = s.charAt(i);
            a[i] = unicode1;
            int unicode2 = stringBuilder.charAt(i);
            b[i] = unicode2;
        }
        int count = 0;
        for (int i = 0; i < a.length ; i++) {
            int d = 0;
            int e = 0;
            if(i<a.length-1){

                 d = (a[i]-a[i+1]);
                 e = (b[i]-b[i+1]);
            }

            if(Math.abs(d)!= Math.abs(e)){
                count++;
            }
        }
        if (count ==0 ) {
            System.out.println("Funny");
        }else{
            System.out.println("Not Funny");
        }
    }

}

