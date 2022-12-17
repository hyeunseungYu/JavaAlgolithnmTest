package Programmers.Level01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Quiz15 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        Stack<Integer> answerStack = new Stack<>();

        for (int i : arr){
            if (answerStack.size() == 0){
                answerStack.push(i);
            }else if (i != answerStack.peek()){
                answerStack.push(i);
            }
        }

        int[] answer = new int[answerStack.size()];

        int index= 0;
        for (int i : answerStack){
            answer[index++] = i;
        }

//        for (int i : answer) {
//            System.out.println(i);
//        }
         }
}
