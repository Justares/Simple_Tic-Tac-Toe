import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int bigOne = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int k = 0; k < arrSize; k++) {
            if (arr[k] > bigOne) {
                bigOne = arr[k];
                max = k;
            }
        }

        System.out.println(max);
    }
}