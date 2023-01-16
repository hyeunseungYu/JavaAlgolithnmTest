class Solution {
    public int solution(int n) {
         String binary = Integer.toBinaryString(n);

        String answerStr = "";
        while (true) {

            if (count(Integer.toBinaryString(++n)) == (count(binary)) ){
                answerStr = Integer.toString(n);
                break;
            }
        }
        int answer = Integer.parseInt(answerStr);
        return answer;
    }
    static int count(String binary) {

        char[] arr = binary.toCharArray();
        int cnt = 0;
        for (char c : arr) {
            if (c == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}