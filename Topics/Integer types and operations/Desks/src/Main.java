import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grp1 = scanner.nextInt();
        int grp2 = scanner.nextInt();
        int grp3 = scanner.nextInt();
        int deskCount = 0;

        int[] grp4 = new int[]{grp1,grp2,grp3};


        for (int i = 0; i < 3; i++){
            if(grp4[i] % 2 != 0) {
                deskCount += grp4[i] / 2 +1;
            }else {

                deskCount += grp4[i]/2;
            }
        }
        System.out.println(deskCount);
        // put your code here
    }
}