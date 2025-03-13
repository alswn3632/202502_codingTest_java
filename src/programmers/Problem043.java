package programmers;

import java.util.*;

public class Problem043 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/68644
    //월간 코드 챌린지 시즌1

    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
