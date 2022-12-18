import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

//      정답배열의 길이를 가지는 각각의 배열 생성
        int[] firstArr = new int[answers.length];
        int[] secondArr = new int[answers.length];
        int[] thirdArr = new int[answers.length];

//      각 배열에 반복되는 수들 넣어줌
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = first[i % 5];
        }

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = second[i % 8];
        }

        for (int i = 0; i < thirdArr.length; i++) {
            thirdArr[i] = third[i % 10];
        }

//      점수 계산을 위한 변수
        int firstScore = 0, secondScore = 0, thirdScore = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstArr[i]) {
                firstScore++;
            }
            if (answers[i] == secondArr[i]) {
                secondScore++;
            }
            if (answers[i] == thirdArr[i]) {
                thirdScore++;
            }
        }
//      최다득점 계산
        int[] src = {firstScore, secondScore, thirdScore};
        List<Integer> answerList = new ArrayList<>();
        List<Integer> answerSrc = new ArrayList<>();

        for (int i : src) {
            answerList.add(i);
        }

        int max = 0;

        for (int i = 0; i < answerList.size(); i++) {
            max = Math.max(max, answerList.get(i));
        }



        for (int i = 0; i < answerList.size(); i++) {
            if (answerList.get(i) == max){
                answerSrc.add(i+1);
            }

        }

        int[] answer = new int[answerSrc.size()];

        int index = 0;
        for (int i : answerSrc) {
            answer[index++] = i;
        }
        return answer;
    }
}