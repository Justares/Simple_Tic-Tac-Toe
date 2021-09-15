import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + " ");
        while (n != 1) {

            if (n % 2 == 0) {
                n /= 2;
                System.out.print(n + " ");
            } else {
                n *=3;
                n++;
                System.out.print(n + " ");
            }
        }
        // pusa code here
    }
}