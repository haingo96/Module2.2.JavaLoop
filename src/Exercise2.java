public class Exercise2 {
    public static void main(String[] args) {
        int cnt = 0;
        int initialValue = 0;

        while (cnt < 20) {
            if (isPrime(initialValue)) {
                System.out.println(initialValue);
                cnt++;
            }
            initialValue++;
        }
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
