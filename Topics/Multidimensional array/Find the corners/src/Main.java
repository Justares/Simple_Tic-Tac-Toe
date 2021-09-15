class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int[] arrTop = new int[twoDimArray[0].length];
        int[] arrBot = new int[twoDimArray.length];

        for(int i = 0; i < twoDimArray.length; i++){
            for(int k = 0; k < twoDimArray[i].length; k++) {
                if(i == 0) {
                    arrTop[k] =twoDimArray[i][k];
                }

                if(i == twoDimArray.length-1){
                    arrBot[k] =twoDimArray[i][k];
                }
            }
        }

        System.out.print(arrTop[0] + " ");
        System.out.println(arrTop[arrTop.length-1]);
        System.out.print(arrBot[0] + " ");
        System.out.println(arrBot[arrBot.length-1] + " ");

    }
}