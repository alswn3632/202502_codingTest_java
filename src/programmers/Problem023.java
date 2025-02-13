package programmers;

import java.util.Arrays;

public class Problem023 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12941
    //연습문제

    public int solution(int []A, int []B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }

        return answer;
    }
}
