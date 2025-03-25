package programmers01;

public class Problem031 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12945?language=java
    //연습문제

    public long solution(int n) {
        long answer = 0;

        if (n == 0) return 1;
        if (n == 1) return 2;

        long num1 = 1;
        long num2 = 0;

        for (int i = 2; i <= n; i++) {
            answer = (num1 + num2) % 1234567;
            num2 = num1;
            num1 = answer;
        }

        return answer;
    }
}
