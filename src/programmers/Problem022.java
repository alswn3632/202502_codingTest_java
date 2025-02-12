package programmers;

import java.util.Arrays;

public class Problem022 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12939
    //연습문제

    public String solution(String s) {
        String answer = "";

        int[] arr = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        answer = min + " " + max;

        return answer;
    }

}
