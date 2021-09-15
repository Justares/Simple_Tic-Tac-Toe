import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int max = Integer.MIN_VALUE;
        int mi1 = 0;
        int mi2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] > max) {
                    max = array[i][k];
                    mi1 = i;
                    mi2 = k;
                }
            }
        }

        System.out.println(mi1 + " " + mi2);
    }
}