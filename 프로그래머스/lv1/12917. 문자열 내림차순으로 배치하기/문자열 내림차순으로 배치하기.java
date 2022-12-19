import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sList =s.split("");
// 문자열을 배열으로 바꾸고 내림차순으로 정렬
        String[] answerList = Arrays.stream(sList).sorted(Comparator.reverseOrder())
                                                    .toArray(a -> new String[a]);

        String answer = "";

        for (String s1 : answerList) {
            answer += s1;
        }
        return answer;
    }
}