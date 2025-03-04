package programmers;

public class Problem036 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12922
    //연습문제

    public String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++){
            answer += i%2==1? "수" : "박";
        }

        return answer;
    }
}
