package programmers;

public class Problem021 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12951
    //연습문제

    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ", -1);

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                arr[i] = arr[i].toLowerCase();

                if (arr[i].length() > 1) {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                } else {
                    arr[i] = arr[i].toUpperCase();
                }
            }

            answer += (arr[i]);
            if (i < arr.length - 1) {
                answer += (" ");
            }
        }

        return answer;
    }

}
