package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Quiz03 {
    public static void main(String[] args) {
        List<Long> ar = new ArrayList<>();

        int n = 5;
        ar.add(1000000001L);
        ar.add(1000000002L);
        ar.add(1000000003L);
        ar.add(1000000004L);
        ar.add(1000000005L);

        long answer = 0;
        for (Long aLong : ar) {
            answer += aLong;
        }

        System.out.println(answer);
    }
}
