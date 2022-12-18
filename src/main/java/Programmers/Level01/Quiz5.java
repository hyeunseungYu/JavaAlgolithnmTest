package Programmers.Level01;

public class Quiz5 {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";

        String[] answerArr = s.split("");
        int index =0;

        for (String ss : answerArr){
            index = (ss.equals(" ")) ? 0 : index +1;
//            index++가 아니라 index + 1. ++index처럼 1을 먼저 더해주니까 홀수번째를 대문자로 바꿔줘야함.
            answer += (index % 2 == 0) ? ss.toLowerCase() : ss.toUpperCase();
        }
        System.out.println(answer);

//
//        int index = 0;
//
//        for (int i = 0; i < answerArr.length; i++){
//            if (answerArr[i].equals(" ")){
//                answer += " ";
//                index = 0;
//            }
//
//            if (i%2 ==0){
//                answer += answerArr[i].toUpperCase();
//                index++;
//            }else {
//                answer += answerArr[i];
//            }
//        }
//        System.out.println(answer);


    }
}
