package programmers;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem050 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42583
    //스택/큐

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> bridge = new ArrayDeque<>();

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        int bridge_weight = 0;
        int idx = 0;
        while (idx < truck_weights.length) {
            answer++;
            bridge_weight -= bridge.poll();

            if (bridge_weight + truck_weights[idx] <= weight) {
                bridge.add(truck_weights[idx]);
                bridge_weight += truck_weights[idx];
                idx++;
            } else {
                bridge.add(0);
            }
        }

        answer += bridge_length;
        return answer;
    }
}
