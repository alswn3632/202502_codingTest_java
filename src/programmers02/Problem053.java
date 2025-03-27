package programmers02;

import java.util.Arrays;

public class Problem053 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42747#fn1
    //정렬

    public int solution(int[] citations) {
        int answer = 0;

        // 배열 정렬
        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++){
            // 현재 논문 수(h)
            int h = citations.length - i;

            // 현재 논문의 인용 횟수가 h 이상이면 정답
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }

        return answer;
    }
}
