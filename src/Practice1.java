import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input your number:");
        int inputNumber = scn.nextInt();

        System.out.println(isPrime(inputNumber));
    }

    private static boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}