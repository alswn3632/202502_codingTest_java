package programmers;

public class Problem035 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12979
    //Summer/Winter Coding(~2018)

    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        int start = 1;
        int gap = 0;

        for(int station : stations){
            int left = station - w;
            if(start < left){
                // 전파가 닿지 않는 범위 구하기
                gap = left - start;
                // 해당 범위에서 설치할 최소 기지국 개수 구하기
                answer += Math.ceil(gap/(double)(2*w+1));
            }
            start = station + w + 1;
        }

        // stations 배열이 끝나고도,
        // 전파가 닿지 않는 아파트가 남아있을 경우
        if(start <= n){
            gap = n - start + 1;
            answer += Math.ceil(gap/(double)(2*w+1));
        }

        return answer;
    }
}
