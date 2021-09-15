import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = false;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = 0;
        int[][] kino = new int[n][m];

        for (int i = 0; i < kino.length; i++) {
            for (int j = 0; j < kino[i].length; j++) {
                kino[i][j] = scanner.nextInt();
            }
        }

        k = scanner.nextInt();
        int nullCount = 0;
        for (int i = m-1; i > 0; i--) {
            for (int s = 0; s < kino[i].length+1; s++) {

                if (kino[i][s] == 0) {
                    System.out.println("i");
                    nullCount += 1;
                }

                if (nullCount == k) {
                    System.out.println(i);
                    b = true;
                    break;
                }
            }
        }

        if(!b) {
            System.out.println(0);
        }
        // put your code here
    }
}