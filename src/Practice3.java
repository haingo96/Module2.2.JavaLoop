public class Practice3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int commonWish = a;

        while (b % commonWish != 0 || a % commonWish != 0) {
            commonWish--;
        }

        System.out.println(commonWish);
    }
}