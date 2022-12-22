package sparta;

import java.util.Arrays;

public class Test04_아직푸는중 {
    public static void main(String[] args) {
        int N = 8;
        int X = 4;
        int Y = 5;
        int R = 3;

        int[][] srcArr = new int[N][N];
        for (int[] i : srcArr) {
            Arrays.fill(i, 0);
        }

        int currentLocation = srcArr[X][Y];


        for (int i = 0; i < srcArr.length; i++) {
            for (int j = 0; j < srcArr.length; j++) {

                if (i == (X - 1) && j == (Y - 1)) {
                    System.out.print("X");
                    continue;
                }

                for (int k = 0; k < R; k++) {
                    int[] dx = {0, 0, (k + 1), -(k + 1)};
                    int[] dy = {(k + 1), -(k + 1), 0, 0};

                    int row = (X - 1) + dx[k];
                    int column = (Y - 1) + dy[k];


                    if (i == row && j == column) {

                        System.out.print(k + 1);
                        break;
                    }



                }

                    System.out.print(srcArr[i][j]);


            }
            System.out.println();

        }


    }
}

