package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Problem045 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/159994
    //연습문제

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        ArrayDeque<String> cardDeq1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardDeq2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeq = new ArrayDeque<>(Arrays.asList(goal));

        while(!goalDeq.isEmpty()){
            if(!cardDeq1.isEmpty() && cardDeq1.peekFirst().equals(goalDeq.peekFirst())){
                cardDeq1.pollFirst();
                goalDeq.pollFirst();
            }else if(!cardDeq2.isEmpty() && cardDeq2.peekFirst().equals(goalDeq.peekFirst())){
                cardDeq2.pollFirst();
                goalDeq.pollFirst();
            }else{
                break;
            }
        }

        answer = goalDeq.isEmpty()? "Yes" : "No";

        return answer;
    }
}
