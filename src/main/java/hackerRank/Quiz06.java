package hackerRank;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Quiz06 {
    public static void main(String[] args) {
        List<String> unsorted = Arrays.asList("6", "1", "3","31415926535897932384626433832795");
        Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                //문자열 길이부터 비교
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o2.length() > o1.length()) {
                    return -1;
                }

                //문자열을 char로 하나씩 쪼갬. 문자열 하나씩 비교하면서 정렬. 같으면 0 리턴
                char[] a1 = o1.toCharArray();
                char[] a2 = o2.toCharArray();

                for (int i = 0; i < a1.length; i++) {
                    if (a1[i] > a2[i]) {
                        return 1;
                    } else if (a2[i] > a1[i]) {
                        return -1;
                    }
                }
                return 0;
            }
        });




    }
}
