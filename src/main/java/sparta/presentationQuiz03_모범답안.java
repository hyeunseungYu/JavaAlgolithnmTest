//package sparta;
//import java.util.*;
//
//public class presentationQuiz03_모범답안 {
//    static final int[] dx = {1, -1, 0, 0};
//    static final int[] dy = {0, 0, 1, -1};
//
//    public void solution(int[][] arr1) {
//        boolean[][] check = new boolean[5][5];
//
//        for (int x = 0; x < 5; x++) {
//            for (int y = 0; y < 5; y++) {
//                if (isMaxNumber(arr1, x, y)) {
//                    check[x][y] = true;
//                }
//            }
//        }
//        printDeepArray(arr1, check);
//        System.out.println(Arrays.deepToString(check));
//    }
//
//    private static boolean isMaxNumber(int[][] arr1, int x, int y) {
//        for (int i = 0; i < 4; i++) {
//            int tmpX = dx[i];
//            int tmpY = dy[i];
//
//            if (isOutOfRange(x, y, tmpX, tmpY)) {
//                continue;
//            }
//            if (isNotMaxNumber(arr1, x, y, tmpX, tmpY)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean isNotMaxNumber(int[][] arr1, int x, int y, int tmpX, int tmpY) {
//        return arr1[x][y] <= arr1[x + tmpX][y + tmpY];
//    }
//
//    private static boolean isOutOfRange(int x, int y, int tmpX, int tmpY) {
//        return x + tmpX < 0 || y + tmpY < 0 || x + tmpX >= 5 || y + tmpY >= 5;
//    }
//
//    private static void printDeepArray(int[][] arr1, boolean[][] check) {
//        for (int x = 0; x < 5; x++) {
//            for (int y = 0; y < 5; y++) {
//                if (check[x][y] == true) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print(arr1[x][y] + " ");
//                }
//            }
//            System.out.println("");
//        }
//    }
//
//    private static boolean isMaxNumberV2(int[][] arr1, int x, int y) {
//        System.out.println("===============================");
//        System.out.println("현재 좌표 : (" + x +"," + y + ")" + " 값 " + arr1[x][y]);
//        System.out.println("===============================");
//        for (int i = 0; i < 4; i++) {
//            int tmpX = dx[i];
//            int tmpY = dy[i];
//            if (isOutOfRange(x, y, tmpX, tmpY)) {
//                System.out.println("("+(x + tmpX) + ","+ (y + tmpY) + ")는 존재하지 않는 좌표 입니다.");
//                continue;
//            }
//            System.out.println("비교 대상 좌표 : (" + (x + tmpX) +"," +  + (y + tmpY) + ")" + " 값 " + arr1[x + tmpX][y + tmpY]);
//
//            if (!isNotMaxNumber(arr1, x, y, tmpX, tmpY)) {
//                System.out.println("비교 대상보다 큽니다.");
//            } else {
//                System.out.println("비교 대상보다 작습니다.");
//                System.out.println("[현재 좌표는 최대값이 아닙니다.]");
//                return false;
//            }
//        }
//        System.out.println("[현재 좌표는 최대값이 맞습니다.]");
//        return true;
//    }
//
//    public static void main(String[] args) {
//        p3 method = new p3();
//        int[][] arr1 = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};
//        method.solution(arr1);
//        System.out.println("=========");
//        System.out.println("구분선입니다");
//        System.out.println("=========");
//        int[][] arr2 = {{3,4,1,4,9}, {2,9,4,5,8}, {9,0,8,2,1}, {7,0,2,8,4}, {2,7,2,1,4}};
//        method.solution(arr2);
//    }
//}
