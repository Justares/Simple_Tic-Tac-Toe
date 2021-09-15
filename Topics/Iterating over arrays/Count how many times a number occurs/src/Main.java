import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int n;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        for (int i = 0; i < arrSize; i++) {
            if(arr[i] == n) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}