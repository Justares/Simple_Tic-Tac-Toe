import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int y = 0;
        while (m < k) {
            m = m + m * (p / 100);
            y++;
        }
        System.out.println(y);
        // write your code here
    }
}