package programmers01;

import java.util.Stack;

public class Problem040 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12906
    //스택/큐

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
