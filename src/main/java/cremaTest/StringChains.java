package cremaTest;

import java.util.*;

public class StringChains {
    public static int longestStringChain(List<String> words) {

        words.sort(Comparator.comparingInt(s -> s.length()));
        Map<String, Integer> chainLengths = new HashMap<>();

        int answer = 1;

        for (String word : words) {
            int currentChain = 1;

            for (int i = 0; i < word.length(); i++) {
                String reducedWord = word.substring(0, i) + word.substring(i + 1);

                if (chainLengths.containsKey(reducedWord)) {
                    if (chainLengths.get(reducedWord) + 1 > currentChain) {
                        currentChain = chainLengths.get(reducedWord) + 1;
                    }

                }
            }

            chainLengths.put(word, currentChain);
            if (currentChain > answer) {
                answer = currentChain;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "and", "an", "bear");
        System.out.println(longestStringChain(words));

    }
}
