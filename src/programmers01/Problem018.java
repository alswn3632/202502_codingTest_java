package programmers01;

public class Problem018 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/72410
    //2021 KAKAO BLIND RECRUITMENT [신규 아이디 추천]

    public String solution(String new_id) {
        String answer = new_id.toLowerCase();

        // 2단계 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거.
        answer = answer.replaceAll("[^a-z0-9._-]", "");

        // 3단계 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환.
        answer = answer.replaceAll("\\.{2,}", ".");

        // 4단계 마침표(.)가 처음이나 끝에 위치한다면 제거.
        answer = answer.replaceAll("^\\.|\\.$", "");

        // 5단계 빈 문자열이라면, "a"를 대입.
        if (answer.isEmpty()) answer = "a";

        // 6단계 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거.
        // 만약 제거 후 마침표(.)가 문자열 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거.
        if (answer.length() > 15) {
            answer = answer.substring(0, 15).replaceAll("\\.$", "");
        }

        // 7단계 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임.
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
