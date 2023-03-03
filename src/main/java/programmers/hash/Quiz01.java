package programmers.hash;

import java.util.HashSet;

public class Quiz01 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};

        //겹치지 않는 최대의 경우를 생각하면 일단 겹치는 애들이 없는 경우를 만들어야 함
        HashSet<Integer> answerArr = new HashSet<Integer>();

        for (int num : nums) {
            answerArr.add(num);
        }

        int answer = 0;

        //어짜피 최고로 많은 종류가 오는 경우는 nums를 2로 나눈 만큼 오는 게 최대
        //그게 아니라면 set의 크기를 리턴하면 됨 -> 이게 겹치지 않는 최대 숫자니까
        if (answerArr.size() < nums.length / 2) {
            answer = answerArr.size();
        } else {
            answer = nums.length / 2;
        }

        System.out.println(answer);
    }



}
