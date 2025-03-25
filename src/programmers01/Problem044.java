package programmers01;

import java.util.Stack;

public class Problem044 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/64061
    //2019 카카오 개발자 겨울 인턴십

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int num : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][num-1] != 0){
                    if(!stack.isEmpty() && stack.peek() == board[i][num-1]){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(board[i][num-1]);
                    }
                    board[i][num-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
