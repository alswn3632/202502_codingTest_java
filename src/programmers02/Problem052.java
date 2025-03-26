package programmers02;

import java.util.Arrays;

public class Problem052 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42748
    //정렬

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            // 1. commands[i][0] ~ commands[i][1] 까지 자르고
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // 2. 잘라낸 배열을 오름차순 정렬하고
            Arrays.sort(arr);
            // 3. 배열의 commands[i][2] 번째 숫자를 구해 answer에 담기
            answer[i] = arr[commands[i][2]-1];
        }

        return answer;
    }
}
