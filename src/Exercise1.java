public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }

            System.out.print("\n");
        }
    }
}
