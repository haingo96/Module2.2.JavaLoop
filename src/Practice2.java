import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter investment amount:");
        double invest = scn.nextDouble();

        System.out.println("Enter number of months:");
        short months = scn.nextShort();

        System.out.println("Enter annual interest rate in percentage:");
        double interest = scn.nextDouble();

        double totalInterest = invest * interest / 12 * months;

        System.out.println("Total of interest: " + totalInterest);
    }
}
