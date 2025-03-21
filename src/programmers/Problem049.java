package programmers;

public class Problem049 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42584
    //스택/큐

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            int cnt = 0;
            for(int j=i+1; j<prices.length; j++){
                if(prices[j] >= prices[i]){
                    cnt++;
                }else{
                    cnt++;
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
