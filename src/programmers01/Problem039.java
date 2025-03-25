package programmers01;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem039 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/76502
    //월간 코드 챌린지 시즌2

    public int solution(String s) {
        int answer = 0;
        int n = s.length();

        if (n % 2 == 1) return 0;

        String str = s + s;
        for (int i = 0; i < n; i++) {
            String sub = str.substring(i, i + n);
            if (method(sub)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean method(String str) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
