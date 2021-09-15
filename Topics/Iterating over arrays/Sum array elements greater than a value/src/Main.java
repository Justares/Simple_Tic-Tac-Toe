import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();

        int[] arr = new int[arrSize];

        int sum = 0;
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int v : arr) {
            if (n < v) {
                sum += v;
            }
        }
      System.out.println(sum);
        // put your code here
    }
}