package programmers;

public class Problem037 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12917
    //연습문제

    public String solution(String s) {
        String answer = "";

        char[] arr = s.toCharArray();

        // 내림차순 정렬
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j]<arr[j+1]) {
                    char tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        answer = new String(arr);

        return answer;
    }
}
