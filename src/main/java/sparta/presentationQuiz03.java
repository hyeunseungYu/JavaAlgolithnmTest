package sparta;

import java.util.ArrayList;

public class presentationQuiz03 {
    public static void main(String[] args) {
        int[][] arr = {{7,4,6,5,9},
                       {6,1,3,4,5},
                       {4,8,5,6,9},
                       {1,3,0,6,4},
                       {6,4,8,1,7}
        };


        int[][] check = {{-1, 0},
                        {1, 0},
                        {0, -1},
                        {0, 1}};

boolean test = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                for (int k = 0; k < check.length; k++) {
                    int row = i + check[k][0];
                    int column = j + check[k][1];

                    if (0 <= row && row < arr.length && 0 <= column && column < arr[0].length && arr[row][column] > arr[i][j]) {
                        System.out.print(arr[i][j]);
                        test = false;
                        break;
                    }
                    test =true;

                }
                if (test == true){
                    System.out.print("*");
                }




            }
            System.out.println();

        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i][j])
//
//            }
//
//        }


    }
}
