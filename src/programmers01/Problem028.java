package programmers01;

public class Problem028 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42842
    //완전탐색

    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};

        for(int i=1; i<=Math.sqrt(yellow); i++){
            if(yellow%i ==0){
                int height = i + 2;
                int width = yellow/i + 2;

                if((width)*(height) == (brown + yellow)){
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }

        return answer;
    }
}
