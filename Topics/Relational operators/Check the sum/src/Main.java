import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        if(h1 + h2 == 20 || h1 + h3 == 20 || h2 + h1 == 20 || h2 + h3 == 20 || h3 + h1 == 20 || h3 + h1 == 20) check = true;
        else check = false;

        System.out.println(check);
    }
}