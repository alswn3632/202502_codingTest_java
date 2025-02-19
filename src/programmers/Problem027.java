package programmers;

public class Problem027 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12911
    //연습문제

    public int solution(int n) {
        int answer = 0;

        int num = ((Integer.toBinaryString(n)).replace("0","")).length();

        while(true){
            n++;

            String s = Integer.toBinaryString(n);
            s.replace("0","");
            if(s.length() == num){
                answer = n;
                break;
            }
        }

        return answer;
    }
}
