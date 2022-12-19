package Programmers.Level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Quiz24 {
    public static void main(String[] args) {
        String new_id = "..................................";


//      5단계
        if (new_id.equals("")) {
            new_id += "a";
        }


//      1단계
        String toLowerCase = new_id.toLowerCase();


//      2단계
        String regexChar = "[^-_.a-z0-9]";

        String deleteChar = toLowerCase.replaceAll(regexChar, "");


//      3단계
        String regex3rd = "\\.{2,}";
        String temp = deleteChar.replaceAll(regex3rd, ".");


        String[] srcList = temp.split("");
        ArrayList<String> idList = new ArrayList<>();

        for (String s : srcList) {
            idList.add(s);
        }
//
//        for (int i = 0; i < idList.size(); i++) {
//            for (int j = i + 1; j < idList.size(); j++) {
//                if (idList.get(i).equals(".") && idList.get(j).equals(".")) {
//                    idList.remove(i);
//                    break;
//                }
//            }
//        }
//
//      4단계

        if (idList.get(0).equals(".")) {
            idList.remove(0);
        }

        //      5단계
        if (idList.size() == 0) {
            idList.add("a");
        }

        if (idList.get(idList.size() - 1).equals(".")) {
            idList.remove(idList.size() - 1);
        }


//      6단계
        while (idList.size() > 15){
            idList.remove(idList.size() -1);
        }




        //      4단계
        if (idList.get(0).equals(".")){
            idList.remove(0);
        }

        if (idList.get(idList.size()-1).equals(".")){
            idList.remove(idList.size()-1);
        }



//        7단계
        while (idList.size() < 3){
            idList.add(idList.get(idList.size()-1));
        }

        String answer = "";

        for (String s : idList) {
            answer += s;
        }

        System.out.println(answer);



    }
}
