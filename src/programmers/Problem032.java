package programmers;

import java.util.Stack;

public class Problem032 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12973
    //2017 팁스타운

    public int solution(String s){
        int answer = -1;

        // 문자열 길이가 홀수라면 제거 실패
        if(s.length()%2 == 1){ return 0; }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        answer = stack.isEmpty() ? 1 : 0;

        return answer;
    }
}
