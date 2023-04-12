package hackerRank;

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,8,10,12,3); // 입력 리스트

        int n = arr.size(); // 배열의 크기

        int[] trans = new int[n]; // 새로운 배열 생성

        for (int i = 0; i < n; i++) {
            trans[i] = arr.get(i); // 리스트의 요소를 배열로 복사
        }

        int lastIndex = n - 1;
        int target = trans[lastIndex]; // 마지막 요소를 새로운 요소로 설정

        for (int i = lastIndex; i > 0; i--) {
            if (trans[i - 1] > target) {
                trans[i] = trans[i - 1];
            } else {
                trans[i] = target;
                break; // 올바른 위치에 삽입된 경우 반복 종료
            }
            for (int j = 0; j < n; j++) {
                System.out.print(trans[j] + " "); // 배열의 변화 출력
            }
            System.out.println();
        }

        //제일 앞의 수가 제일 뒤의 인덱스 보다 큰 경우를 위해 넣어둠
        // ex) 5, 8, 10, 12, 3일 때 아래 코드가 없으면 5,5,8,10,12로 끝나버림
        if (trans[0] > target) {
            trans[0] = target; // 첫 번째 요소에 새로운 요소 삽입
        }

        for (int j = 0; j < n; j++) {
            System.out.print(trans[j] + " "); // 정렬된 배열 출력
        }
        System.out.println();
    }
}

