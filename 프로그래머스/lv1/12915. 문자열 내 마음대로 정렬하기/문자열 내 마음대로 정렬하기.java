import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
         String[] answer = Arrays.stream(strings).sorted()
                                        .sorted(Comparator.comparing(string -> string.charAt(n)))
                                        .toArray(a -> new String[a]);
        return answer;
    }
}