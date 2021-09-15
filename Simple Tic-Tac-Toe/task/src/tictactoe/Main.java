package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String cells = scanner.nextLine();
        char[][] feld = new char[3][3];
        feld[0][0] = cells.charAt(1);
        createAndPrintField(feld, cells);

        userInput(scanner,feld);

        for (int i = 0; i < feld.length; i++) {
            for (int k = 0; k < feld.length; k++) {
                System.out.print(" " + feld[i][k] + " ");

            }
            System.out.println("");
        }
        System.out.println("---------");


        chkState(cells);

    }

    public static void chkState(String cells) {
        if (cells.length() != 9) {
            System.out.println("Impossible");
        } else if (winX(cells) && winO(cells)) {
            System.out.println("Impossible");


        } else if (winX(cells)) {
            System.out.println("X wins");

        } else if (winO(cells)) {
            System.out.println("O wins");
        } else {

            int xCounter = 0;
            int oCounter = 0;
            for (int i = 0; i < cells.length(); i++) {
                if (cells.charAt(i) == 'X') {
                    xCounter++;
                }
            }
            for (int i = 0; i < cells.length(); i++) {
                if (cells.charAt(i) == 'O') {
                    oCounter++;
                }
            }
            if (xCounter - oCounter > 1 || xCounter - oCounter < -1) {
                System.out.println("Impossible");
            } else if (xCounter == 4 && oCounter == 5 || xCounter == 5 && oCounter == 4) {
                System.out.println("Draw");
            } else {
                System.out.println("Game not finished");
            }

        }

    }

    public static boolean winX(String smth) {
        if (smth.charAt(0) == 'X' && smth.charAt(1) == 'X' && smth.charAt(2) == 'X') {
            return true;
        } else if (smth.charAt(3) == 'X' && smth.charAt(4) == 'X' && smth.charAt(5) == 'X') {
            return true;
        } else if (smth.charAt(6) == 'X' && smth.charAt(7) == 'X' && smth.charAt(8) == 'X') {
            return true;
        } else if (smth.charAt(0) == 'X' && smth.charAt(3) == 'X' && smth.charAt(6) == 'X') {
            return true;
        } else if (smth.charAt(1) == 'X' && smth.charAt(4) == 'X' && smth.charAt(7) == 'X') {
            return true;
        } else if (smth.charAt(2) == 'X' && smth.charAt(5) == 'X' && smth.charAt(8) == 'X') {
            return true;
        } else if (smth.charAt(0) == 'X' && smth.charAt(4) == 'X' && smth.charAt(8) == 'X') {
            return true;
        } else if (smth.charAt(6) == 'X' && smth.charAt(4) == 'X' && smth.charAt(2) == 'X') {
            return true;
        } else {
            return false;
        }


    }

    public static boolean winO(String smth) {
        if (smth.charAt(0) == 'O' && smth.charAt(1) == 'O' && smth.charAt(2) == 'O') {
            return true;
        } else if (smth.charAt(3) == 'O' && smth.charAt(4) == 'O' && smth.charAt(5) == 'O') {
            return true;
        } else if (smth.charAt(6) == 'O' && smth.charAt(7) == 'O' && smth.charAt(8) == 'O') {
            return true;
        } else if (smth.charAt(0) == 'O' && smth.charAt(3) == 'O' && smth.charAt(6) == 'O') {
            return true;
        } else if (smth.charAt(1) == 'O' && smth.charAt(4) == 'O' && smth.charAt(7) == 'O') {
            return true;
        } else if (smth.charAt(2) == 'O' && smth.charAt(5) == 'O' && smth.charAt(8) == 'O') {
            return true;
        } else if (smth.charAt(0) == 'O' && smth.charAt(4) == 'O' && smth.charAt(8) == 'O') {
            return true;
        } else if (smth.charAt(6) == 'O' && smth.charAt(4) == 'O' && smth.charAt(2) == 'O') {
            return true;
        } else {
            return false;
        }
    }

    public static void createAndPrintField(char[][] feld, String cells) {
        int cellsI = 0;
        System.out.println("---------");
        for (int i = 0; i < feld.length; i++) {
            for (int k = 0; k < feld[i].length; k++) {

                if (cellsI < 9) {
                    feld[i][k] = cells.charAt(cellsI);
                    cellsI++;
                }
            }

        }

    }


    public static void userInput(Scanner scanner, char[][] feld) {
        int[] userInput = new int[2];
        userInput[0] = scanner.nextInt()-1;
        userInput[1] = scanner.nextInt()-1;

        feld[userInput[0]][userInput[1]] = 'X';
    }


}