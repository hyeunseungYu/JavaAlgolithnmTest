import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> answerString = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                answerString.push(s.charAt(i));

            }else {
                if (answerString.isEmpty()){
                    answer = false;
                }else {
                    answerString.pop();
                }

            }

        }

        if (!answerString.isEmpty()){
            answer = false;
        }
        return answer;
    }
}