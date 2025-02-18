package programmers;

public class Problem026 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12924
    //연습문제

    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            int num = 0;
            for(int j=i; j<=n; j++){
                num += j;
                if(num > n){
                    break;
                }else if(num == n){
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
