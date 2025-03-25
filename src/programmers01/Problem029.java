package programmers01;

public class Problem029 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12980
    //Summer/Winter Coding(~2018)

    public int solution(int n) {
        int answer = 0;

        // 5000 2500 1250 625 624(1) 312 156 78 39 38(1) 19 18(1) 9 8(1) 4 2 1 0(1)

        while(n != 0){
            if(n%2 == 0){
                n /= 2;
            }else{
                answer++;
                n -= 1;
            }
        }

        return answer;
    }
}
