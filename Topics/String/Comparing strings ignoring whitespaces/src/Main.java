import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        a = a.replaceAll("\\s+","");
        b = b.replaceAll("\\s+","");
        if (a.equals(b)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        // put your code here
    }
}