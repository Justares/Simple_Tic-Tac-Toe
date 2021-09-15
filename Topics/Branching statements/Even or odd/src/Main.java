import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        while (b) {
            int i = scanner.nextInt();
            if (i == 0) {
                b = false;
            } else if (i % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }
}