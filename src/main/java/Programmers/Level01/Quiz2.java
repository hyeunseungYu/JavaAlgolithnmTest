package Programmers.Level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 36, 1, 3};
        int divisor = 1;

        int[] answerArr = new int[]{};
        int restCnt = 0;

        for (int i =0; i < arr.length; i++){
            if (arr[i]%divisor == 0){
                restCnt++;
            }
        }

        if (restCnt > 0){
            answerArr = new int[restCnt];
        }else if (restCnt == 0){
            answerArr = new int[]{-1};
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0){
                answerArr[restCnt -1] = arr[i];
                restCnt--;
            }
        }

        for (int s : answerArr){
            System.out.println(s);
        }

        int temp = 0;

        for (int i =0; i < answerArr.length; i++){

            for (int j = i+1; j < answerArr.length; j++){

                if (answerArr[i] > answerArr[j]){
                    temp = answerArr[i];
                    answerArr[i] = answerArr[j];
                    answerArr[j] = temp;
                }
            }


        }

        for (int s : answerArr){
            System.out.println(s);
        }


    }
}
