import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new  int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k]--;
            System.out.print(arr[k] + " ");
        }

    }
}