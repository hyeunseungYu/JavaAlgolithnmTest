//기원이는 오늘 항해99를 시작했다. 성격이 급한 기원이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
//
//항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.
//
//### 제한 조건
//
//- 1 ≤ month ≤ 12
//- 1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)

//입출력 예시
//11	27	“3월 5일”
//6	    22	“9월 28일”

package sparta;

public class MockExam1 {
    public String solution(int month, int day){
        int[] dayList = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        int sum = 0;

        // 오늘 날짜 계산
        for (int i = 0; i < month - 1; i++) {
            sum += dayList[i];

        }

        int today = sum + day;


        // 졸업하는 날짜 계산
        int graduation = today + 98;

        if (graduation > 365) {
            graduation = graduation % 365;
        }

        // 합산된 졸업 날짜가 어느 달에 속하는 지를 확인함
        int monthCal = 0;
        int monthResult = 0;
        for (int i = 0; i < dayList.length; i++) {
            monthCal += dayList[i];
            monthResult++;
            if (monthCal > graduation) {
                break;
            }
        }


//      해당 월의 어떤 날인지를 계산하기 위해, 합산된 졸업 날짜에서 이전 월의 날짜들 합친 값을 빼 준다.
        int dayCal = 0;

        for (int i = 0; i < monthResult - 1; i++) {
            dayCal += dayList[i];
        }

        int dayResult = graduation - dayCal;

        String answer = monthResult + "월"+" "+dayResult + "일";
        return answer;
    }

    public static void main(String[] args) {
        MockExam1 method = new MockExam1();
        System.out.println(method.solution(7,2));
    }
}


