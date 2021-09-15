import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        while (a != 0) {
            a = scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
}