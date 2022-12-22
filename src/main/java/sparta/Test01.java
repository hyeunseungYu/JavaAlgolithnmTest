package sparta;

public class Test01 {
    public static void solution(int N, int M) {

        int cnt = 0;

        for (int i = N; i <= M; i++) {

            if (cnt == 4){
                System.out.println();
                cnt = 0;
            }
            if (i%2 == 1){
                System.out.print(i + " ");
                cnt++;

            }


        }
    }

    public static void main(String[] args) {
        int N = 115;
        int M = 134;
        Test01.solution(N,M);
    }
}

