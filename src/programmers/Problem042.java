package programmers;

public class Problem042 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/87390
    //월간 코드 챌린지 시즌3

    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] answer = new int[size];

        for (long i=left; i<=right; i++) {
            int row = (int)(i/n);
            int col = (int)(i%n);
            answer[(int)(i-left)] = Math.max(row,col) + 1;
        }

        return answer;
    }
}
