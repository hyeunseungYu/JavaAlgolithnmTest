import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String[] cloth : clothes) {
            //만약 해시에 키가 없으면 1개로 카운트 해서 추가
            if (!hashMap.containsKey(cloth[1])) {
                hashMap.put(cloth[1], 1);

            //해시에 키가 존재하면 이전 카운트에 1 추가
            } else if (hashMap.containsKey(cloth[1])) {
                hashMap.put(cloth[1], hashMap.get(cloth[1]) + 1);

            }
        }

        //경우의 수를 위해 answer에 곱해줄 것이니까 1로 해줌
        int answer = 1;

        //해시의 밸류에 +1(옷을 안입는 경우의 수를 추가해줌)을 해주고 곱해준다(전체 경우의 수 구하기)
        for (Integer value : hashMap.values()) {
            answer *= value + 1;
        }

        //옷 전체를 안입는 경우는 없기 때문에 해당 경우의 수를 빼준다.

        return answer-1;
    }
}