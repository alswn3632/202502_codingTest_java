package programmers01;

public class Problem030 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12914
    //연습문제

    public long solution(int n) {
        long answer = 0;

        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;

        for (int i=3; i<=n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }

        return arr[n];
    }
}
