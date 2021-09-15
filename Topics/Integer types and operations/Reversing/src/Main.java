import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int rev = 0;
        for (int i = 0; i < 3; i++){
            int digit = value % 10;
            rev = rev * 10 + digit;
            value /= 10;

        }
        System.out.println(rev);
    }
}