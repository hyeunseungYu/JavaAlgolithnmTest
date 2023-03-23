import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        List<String> parse = Arrays.stream(numbers).mapToObj(i -> String.valueOf(i)).collect(Collectors.toList());

        parse.sort((s1,s2) -> (s2 + s1).compareTo(s1 + s2));

        String answer = "";
        
        if (parse.get(0).equals("0")) {
           return answer = "0";
        }

        for (String s : parse) {
            answer += s;
        }
  
        
        
        return answer;
    }
}