import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read array input
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int rot = scanner.nextInt();
        int last = arr[arr.length - 1];
        for (int k = 0; k < rot; k++) {
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
        }
        arr[0] = last;

        for (int m = 0; m < arr.length; m++) {
            System.out.println(arr[m] + " ");
        }
        // put your code here
    }
}