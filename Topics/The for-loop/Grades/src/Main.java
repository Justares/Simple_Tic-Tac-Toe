import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int g = scanner.nextInt();
            if (g == 5) {
                a++;
            } else if (g == 4) {
                b++;
            } else if (g == 3) {
                c++;
            } else if (g == 2) {
                d++;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}