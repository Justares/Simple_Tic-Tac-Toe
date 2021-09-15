import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int varr = scanner.nextInt(); // N 3 ARRAY
        int platz = scanner.nextInt();// M 4 Plätze
        int[][] arr1 = new int[varr][platz]; // 3 arrays a 4 plätze
        int[][] arr2 = new int[platz][varr]; // 4 arrays a 3 plätze
        int counter = varr;

        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1[i].length; k++) {
                arr1[i][k] = scanner.nextInt();
            }
        }

        for (int k = 0; k < platz; k++) {
            counter = varr;
            for (int i = varr - 1; i > -1; i--) {

                if (counter == 1) {
                    counter--;
                    System.out.println(arr1[i][k] + " ");
                } else {
                    counter--;
                    System.out.print(arr1[i][k] + " ");
                }

            }
        }

    }
}
