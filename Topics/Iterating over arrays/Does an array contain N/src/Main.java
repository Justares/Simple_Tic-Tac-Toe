import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int lookingFor;

        for (int i = 0; i < arrSize; i++){
            arr[i] = scanner.nextInt();
        }
        lookingFor = scanner.nextInt();

        for(int i:arr){
            if(i == lookingFor){
                result = true;
                break;
            }
        }
      System.out.println(result);
    }
}