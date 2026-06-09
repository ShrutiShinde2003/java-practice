import java.util.Scanner;
public class compound_interest_cal {
    public static void main (String[]args){
        // A = P(1 + r/n)^(nt)
        // A = final amount
        // P = principal amount
        // r = annual interest rate (in decimal)
        // n = number of times interest is compounded per year
        // t = time in years

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        int timesCompounded = scanner.nextInt();

        System.out.print("Enter time in years: ");
        int years = scanner.nextInt();

        double rateDecimal = annualRate / 100;
        double finalAmount = principal * Math.pow(1 + rateDecimal / timesCompounded, timesCompounded * years);

        System.out.printf("Final Amount after %d years: %.2f\n", years, finalAmount);
        
        scanner.close();
    }
}   