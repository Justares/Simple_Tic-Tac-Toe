import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if(word.startsWith("J") || word.startsWith("j")){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        }
}