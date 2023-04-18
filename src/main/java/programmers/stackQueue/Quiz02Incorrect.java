package programmers.stackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Quiz02 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};


        int[] daysLeft = new int[progresses.length];

        //배포까지 남은 일 수 배열 만들기
        for (int i = 0; i < progresses.length; i++) {
            daysLeft[i] = (int)Math.ceil((double) (100 -progresses[i]) / speeds[i]);
        }

        int cnt = 0; //이전 작업보다 먼저 완료되는 일들을 카운트

        List<Integer> answerList = new ArrayList<>();

        //배포까지 남은 일 수들의 배열을 순회
        for (int i = 0; i < daysLeft.length; i++) {

            //0번의 경우 이전 작업이 없으니 패스
            if (i == 0) {
                cnt = 0;
                continue;
            }

            //지금 인덱스가 이전 인덱스 값보다 작으면 먼저 끝나는 작업 -> 카운트 하나 늘려줌
            if (daysLeft[i] <= daysLeft[i - 1]) {
                cnt++;
                //만약 지금 인덱스가 이전 인덱스보다 크면 먼저 완료되지 않는 것
                //-> 지금까지 카운팅의 갯수는 이전 인덱스보다 먼저 끝나는 일들을 카운팅 한 거니까 이전 인덱스도 포함시키기 위해 +1해서 리스트에 넣어줌
                //카운팅은 초기화

            } else if (daysLeft[i] > daysLeft[i - 1]) {
                answerList.add(cnt + 1);
                cnt = 0;
            }

        }

        //제일 마지막 배포에서 배포될 작업의 갯수 추가
        answerList.add(cnt + 1);


        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);

        }

        for (int i : daysLeft) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}
