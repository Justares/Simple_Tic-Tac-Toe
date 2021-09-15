class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        int n = twoDimArray.length;
        int[] first = new int[twoDimArray.length];
        int[] last = new int[twoDimArray.length];


        for (int i = 0; i < twoDimArray.length-1; i++) {
            first[i] = twoDimArray[i][n];
            last[i] =  twoDimArray[i][0];
            twoDimArray[i][0] = twoDimArray[i][n];
            for (int j = 0; j < twoDimArray[i].length-1; j++) {
                if(j == n-1){
                    int temp =  twoDimArray[i][j-1];
                    twoDimArray[i][j-1] = twoDimArray[i][j];
                    twoDimArray[i][j] = temp;
                }

            }
        }

        for(int i = 0; i < first.length; i++){
            twoDimArray[i][0] = first[i];
            twoDimArray[i][n] = last[i];
        }



    }
}
