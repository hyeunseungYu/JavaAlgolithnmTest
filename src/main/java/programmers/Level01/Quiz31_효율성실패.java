package programmers.Level01;

public class Quiz31_효율성실패 {
    public static void main(String[] args) {
        int n = 10;


int answer = 0;
//      1은 소수 아님
        for (int i = 2; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++;
                }

            }

            if (cnt == 1){
                answer++;
            }

        }


    }
}
