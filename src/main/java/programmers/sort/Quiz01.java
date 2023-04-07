package programmers.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz01 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        List<String> parse = Arrays.stream(numbers).mapToObj(i -> String.valueOf(i)).collect(Collectors.toList());

        //parse의 원소들을 비교. 각 원소들을 비교하면서 조합해봤을 때, 더 큰 수가 나오는 경우가 앞으로 오게 됨.
        //예를 들어 3(s1),30(s2)을 비교하면 330과 303을 비교하게 됨. s1 + s2가 더 크니 3,30 순으로 정렬 됨.
        parse.sort((s1,s2) -> (s2 + s1).compareTo(s1 + s2));

        String answer = "";

        for (String s : parse) {
            answer += s;
        }
        //앞이 0이면 그냥 0이니까
        if (parse.get(0).equals("0")) {
            answer = "0";
        }

        System.out.println(answer);


    }
}
