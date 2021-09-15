import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean b = true;
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int n, m;
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        m = scanner.nextInt();
        int atemp = 0;
        int temp = 0;
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] == n) {
                atemp = arr[i];
                temp = i;


                if (atemp == arr[0]) {
                    if (arr[temp + 1] == m) {
                        result = false;
                        b = false;
                    }
                } else if (atemp == arr[arrSize - 1]) {

                    if (arr[temp - 1] == m) {
                        result = false;
                        b = false;
                    }
                } else {
                    if (arr[temp + 1] == m || arr[temp - 1] == m) {
                        result = false;
                    }
                }

            }
        }
        System.out.println(result);

    }

}

