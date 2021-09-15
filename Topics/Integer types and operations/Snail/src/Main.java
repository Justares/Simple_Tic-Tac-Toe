import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int pos = 0;
        int whenAtTheTop = 0;

        while (pos<h){
           pos += a-b;
            whenAtTheTop +=1;
        }
        System.out.println(whenAtTheTop);

        // put your code here
    }
}