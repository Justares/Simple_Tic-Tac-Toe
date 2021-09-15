import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = 1;
        int max = 0;
        while(end !=0){
            int i = scanner.nextInt();
            if(i > max){
                max = i;
            }
            if(i == 0){
                end = 0;
            }
        }

        System.out.println(max);
        // put your code here
    }
}