package programmers01;

import java.util.Arrays;

public class Problem033 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42885
    //탐욕법(Greedy)

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }

            right--;
            answer++;
        }

        return answer;
    }
}
