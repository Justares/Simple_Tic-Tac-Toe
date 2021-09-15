import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] arr = new String[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = "*";
                } else if (i == arr.length / 2) {
                    arr[i][j] = "*";
                } else if (j == arr.length / 2) {
                    arr[i][j] = "*";
                } else if (i == n - j - 1) {
                
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = ".";

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
