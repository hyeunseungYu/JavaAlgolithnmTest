package programmers.hash;

import java.util.*;
import java.util.stream.Collectors;

public class Quiz05 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "rock", "classic", "rock", "metal", "jazz"};
        int[] plays = {1000, 600, 300, 1000, 500, 1000, 700};

        hashing(genres, plays);
    }

    public static int[] hashing(String[] genres, int[] plays) {

        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < genres.length; i++) {
            hashMap.put(plays[i], genres[i]);
        }

       // 장르별 총 재생횟수 계산
        HashMap<String, Integer> totalPlays = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            //이미 장르가 있으면 현재 플레이 횟수에 지금 플레이 횟수를 더함
            //아니면 그냥 집어넣음
            if (totalPlays.containsKey(genre)) {
                totalPlays.put(genre, totalPlays.get(genre) + play);
            } else {
                totalPlays.put(genre, play);
            }

        }

        //베스트 앨범에 수록할 노래 선택
        //해시맵은 순서를 보장하지 않으니 먼저 정렬해줘야됨
        List<String> genreSortedByPlays = new ArrayList<>(totalPlays.keySet());
        Collections.sort(genreSortedByPlays, (a, b) -> totalPlays.get(b).compareTo(totalPlays.get(a)));


        System.out.println("genreSortedByPlays : " + genreSortedByPlays);
        //많이 플레이된 장르 순으로 정렬

        List<Integer> answerList = new ArrayList<>();
        for (String genreSortedByPlay : genreSortedByPlays) {

            List<Integer> songsInGenre = new ArrayList<>();

            for (int i = 0; i < genres.length; i++) {
                if (genreSortedByPlay.equals(genres[i])) {
                    songsInGenre.add(i);
                }
            }

            System.out.println("songInGenre : " + songsInGenre);

            Comparator<Integer> comparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    // o1과 o2를 비교하는 비교 로직 작성
                    // o1이 작을 경우 음수, 같을 경우 0, 큰 경우 양수를 리턴하도록 구현
                    // 예: 오름차순으로 정렬할 경우 o1 - o2를 리턴

                    //재생횟수가 같지 않으면 내림차순으로 정렬
                    if (plays[o1] != plays[o2]) {
                        return plays[o2] - plays[o1];
                    }
                    //재생횟수가 같으면 인덱스가 낮은 것부터
                    return o1 -o2;
                }
            };

            Collections.sort(songsInGenre, comparator);

            //장르에 속한 곡이 1개인 경우가 있으니, 최대 고를 수 있는 갯수인 2개와 비교해서 for문 길이를 잡아줌

            int maxSongsToPick = (songsInGenre.size() < 2) ? songsInGenre.size() : 2;
            for (int i = 0; i < maxSongsToPick; i++) {
                answerList.add(songsInGenre.get(i));
            }

        }


//        LinkedHashMap<Integer, String> sortedHashMap = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                        (e1, e2) -> e2, LinkedHashMap::new));
//
//
//        /*
//         * toMap 파라미터들(순서대로)
//         * @param keyMapper a mapping function to produce keys -> 키매핑
//         * @param valueMapper a mapping function to produce values -> 밸류매핑
//         * @param mergeFunction a merge function, used to resolve collisions between
//         *                      values associated with the same key, as supplied
//         *                      to {@link Map#merge(Object, Object, BiFunction)} -> key가 동일할때 두개의 요소를 어떻게 병합할지. 위에서는 새로운 값으로 덮어쓰게 했음.
//         * @param mapFactory a supplier providing a new empty {@code Map}
//         *                   into which the results will be inserted*/
//

        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer + " " + hashMap.get(integer) );
        }

        System.out.println("=================================");

        for (String s : totalPlays.keySet()) {
            System.out.println(s + " " + totalPlays.get(s));
        }

        System.out.println("================================");
        System.out.println(answerList);


        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);

        }

        return answer;

    }
}
