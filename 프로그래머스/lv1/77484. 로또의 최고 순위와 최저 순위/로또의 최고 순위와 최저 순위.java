import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
       
// ㅣlottos 리스트로 변환
        List<Integer> lottosList = new ArrayList<>();

        for (int i = 0; i < lottos.length; i++) {
            lottosList.add(lottos[i]);
        }
//      0 여부와 상관없이 현재 있는 값들을 이용해서 최저 순위 계산.
        int min = 0;
        for (int i : win_nums){
            int cnt = (int) lottosList.stream().filter(num -> num.equals(i)).count();
            min += cnt;
        }


//      0이 다 맞으면 최고 순위.

        int max = min;
        for (int i : lottos){
            if (i == 0){
                max++;
            }
        }

        int[] answerArr = {max, min};
        int[] answer = {7-max, 7-min};
 if (7-max == 7){
            answer[0] = 6;
        }

        if (7-min == 7){
            answer[1] = 6;
        }
       
        return answer;
    }
}