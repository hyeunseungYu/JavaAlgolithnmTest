package programmers.hash;

import java.util.*;
import java.util.stream.Collectors;

public class Quiz02 {
    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "1235", "567", "88"};

        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));

        boolean answer = true;

        System.out.println(set);

        for (String phoneNumber : phone_book) {
            System.out.println("폰넘버 " + phoneNumber);

            for (int i = 1; i < phoneNumber.length(); i++) {
                System.out.println("substring " + i +" "+ phoneNumber.substring(0, i));
                if (set.contains(phoneNumber.substring(0, i))) {
                    answer = false;
                    break;
                }
            }

            if (!answer) {
                break;
            }
        }
        System.out.println(answer);
    }
}
