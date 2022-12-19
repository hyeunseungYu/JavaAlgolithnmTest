class Solution {
    public int solution(String s) {
        String[] alphabetList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


        for (int i = 0; i < alphabetList.length; i++) {
            if (s.contains(alphabetList[i])){
                s = s.replace(alphabetList[i], Integer.toString(i));
            }

        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}