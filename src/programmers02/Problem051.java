package programmers02;

public class Problem051 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12953
    //연습문제

    public int solution(int[] arr) {
        int answer = arr[0];

        // 두 수의 곱을 최대공약수로 나누면 최소공배수가 된다.
        for (int i=1; i<arr.length; i++) {
            answer = (answer*arr[i])/gcd(answer,arr[i]);
        }

        return answer;
    }

    // 최대공약수를 구하는 방법
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
