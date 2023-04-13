package hackerRank;

import java.util.List;
import java.util.Scanner;

public class RunningTimeOfAlgorithms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //사용자로부터 값을 입력받는 스캐너 쓸거다

        int numElements = in.nextInt(); //문제의 조건임. 처음에는 배열의 크기를 입력받음

        int[] array = new int[numElements]; // 입력받은 크기를 사용해서 문제풀이에 사용할 배열 생성

        //그 담에 입력받는 애들은 위에서 만든 배열에 넣어줌
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        printArray(array);
        sortAndCount(array);

    }

    public static int sortAndCount(List<Integer> arr) {

        int[] array = new int[arr.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = arr.get(i);
        }

        int count = 0;

        for (int i = 1; i < array.length; i++) {
            int key = array[i]; //옮기고자 하는 대상 선택
            int j = i - 1; //대상과 비교하기 위한 용도로 쓰임

            //인덱스의 범위가 0보다 작아지면 안되고, 현재 비교 대상이 j에 해당하는 것보다 작으면
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; //현재 비교 대상을 j의 값으로 바꿈
                count++;
                j--; //j에 -1을 해줌 (이전 인덱스도 비교해야되니까)
            }
            array[j + 1] = key; //while문 조건에 해당되지 않으면 key의 위치를 찾은 것. j는 현재 비교하고자 하는 것의 왼쪽을 비교하니까 +1을 해줘야 제 위치가 됨.
        }

        System.out.println(count);
        return count;
    }

    //입력받은 배열 찍어주는 메서드 요소나오고 띄어쓰기 한 번 이런 식으로. 문제 조건임
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
