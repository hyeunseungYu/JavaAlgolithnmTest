package sparta;

public class Test02 {
    public static int solution(int beer) {
        int serviceCnt = 0;
        int beerLeft = beer;

        if (beer < 10) {
            serviceCnt = 0;
        }


        while (true) {
            serviceCnt += beerLeft / 10;
            beerLeft = (beerLeft / 10) + (beerLeft % 10);

            if (beerLeft < 10){
                break;
            }



        }
        return serviceCnt;
    }

    public static void main(String[] args) {
        int beer = 1091;
        System.out.println(Test02.solution(beer));
    }
}
