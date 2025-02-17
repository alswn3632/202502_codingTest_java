package programmers;

public class Problem025 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/70129
    //월간 코드 챌린지 시즌1

    public int[] solution(String s) {
        int[] answer = {0, 0};

        while (!s.equals("1")) {
            int prevLen = s.length();
            s = s.replace("0", "");
            int nextLen = s.length();

            // 제거한 "0" 개수 추가
            answer[1] += (prevLen - nextLen);

            // 이진 변환 수행
            s = binary(nextLen);
            answer[0] += 1;
        }

        return answer;
    }

    public String binary(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.insert(0,num % 2);
            num /= 2;
        }

        return sb.toString();
    }
}
