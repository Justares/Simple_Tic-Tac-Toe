import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean boo = false;
        if(a > 0 && b <= 0 && c <= 0) {
            boo = true;
        }else if( a <= 0 && b > 0 && c <= 0) {
            boo = true;
        }else if (a <= 0 && b <= 0 && c > 0){
            boo = true;
        }
        System.out.println(boo);
    }
}