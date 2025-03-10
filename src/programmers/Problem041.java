package programmers;

public class Problem041 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12981
    //Summer/Winter Coding(~2018)

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        for (int i = 1; i < words.length; i++) {
            // 끝말잇기 규칙 점검
            if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }

            // 중복단어 점검
            for (int j = 0; j < i; j++) {
                if (words[j].equals(words[i])) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    return answer;
                }
            }
        }

        return new int[]{0, 0};
    }
}
