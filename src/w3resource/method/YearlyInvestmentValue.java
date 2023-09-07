package w3resource.method;

import java.util.Scanner;

public class YearlyInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the investment amount : ");
        long amount = scanner.nextLong(); //p

        System.out.println("Input the rate of interest : ");
        int rate = scanner.nextInt();

        System.out.println("Input number of years : ");
        int years = scanner.nextInt(); //t

        investmentValue(amount,rate,years);



    }

    public  static  void  investmentValue(long amount, int rate, int years){
        double percent = (((double) rate/100)); //r
        System.out.println("Years        FutureValue");
        for (int i = 1; i <= years; i++) {
            double fv = (amount * Math.pow((1 + (percent/12)),(12*i)));
            String formattedValue = String.format("%.2f", fv);
            System.out.println(i + "          " + formattedValue);
        }

    }
}
