package programmers;

public class Problem046 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/86051
    //월간 코드 챌린지 시즌3

    public int solution(int[] numbers) {
        int answer = -1;

        int sum = 0;
        for(int num : numbers){
            sum += num;
        }

        answer = 45 - sum;

        return answer;
    }
}
