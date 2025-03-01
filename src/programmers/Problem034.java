package programmers;

import java.util.*;

public class Problem034 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/138476
    //연습문제

    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Comparator.reverseOrder());

        int total = 0;
        for (int num : counts) {
            total += num;
            answer++;
            if (total >= k) break;
        }

        return answer;
    }
}
