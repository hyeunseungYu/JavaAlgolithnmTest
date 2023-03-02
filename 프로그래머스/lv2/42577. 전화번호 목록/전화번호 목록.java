import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));

        boolean answer = true;
        for (String phoneNumber : phone_book) {
            for (int i = 1; i < phoneNumber.length(); i++) {
                if (set.contains(phoneNumber.substring(0, i))) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
