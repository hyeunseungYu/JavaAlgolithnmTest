package Programmers.Level01;


import java.util.*;
import java.util.stream.Collectors;

public class Quiz16 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> List = new ArrayList<>(set);

        Collections.sort(List);
        int[] answer = new int[List.size()];

        for (int i = 0; i < List.size(); i++){
            answer[i] = List.get(i);
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}

