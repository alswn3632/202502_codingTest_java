package programmers01;

import java.util.ArrayList;
import java.util.List;

public class Problem047 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42586
    //스택/큐

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        int n = progresses.length;

        for (int i=0; i<n; i++) {
            list.add((int)Math.ceil((100.0 - progresses[i])/speeds[i]));
        }

        List<Integer> result = new ArrayList<>();

        while (!list.isEmpty()) {
            int maxDay = list.get(0);
            int count = 0;

            while (!list.isEmpty() && list.get(0) <= maxDay) {
                list.remove(0);
                count++;
            }

            result.add(count);
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
