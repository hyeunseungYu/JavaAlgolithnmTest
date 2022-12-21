package programmers.Level01;

import java.util.*;


public class Quiz21 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};

//      내용물에서 숫자 3개를 골라 합치는 경우들을 새로운 리스트를 만들고 거기에 넣는다
        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum.add(nums[i] + nums[j] + nums[k]);
                }

            }

        }


//      stream을 이용해서 소수를 판별하고, 소수들을 뽑아서 answerList에 넣어준다. 다만 소수 판별을 위해서는 람다를 이용할 메소드가 필요하니
//      소수 판별을 위한 메소드를 생성하고 이용한다.
        Integer[] answerList = sum.stream().filter(i -> PrimeCheck(i)).toArray(a -> new Integer[a]);
        int answer = 0;
        answer += answerList.length;


    }
//  소수를 판별하기 위한 메소드
    public static boolean PrimeCheck(int n) {

        int primeCnt = 0;

        if (n == 1) {
            return false;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                primeCnt++;
            }
        }

        if (primeCnt == 2) {
            return true;
        } else {
            return false;
        }
    }

}
