package Programmers.Level01;

import java.util.*;

public class Quiz19 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] answer = Arrays.stream(strings)
//                                      n번째 char가 동일한 경우를 위해 먼저 오름차순으로 정렬
                .sorted()
//                                      n char의 순서대로 정렬
                .sorted(Comparator.comparing(string -> string.charAt(n)))
//                                      정렬된 것을 string으로 만든다.
                .toArray(a -> new String[a]);
    }
}
