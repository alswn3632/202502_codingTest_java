package programmers01;

public class Problem020 {
    public int solution(String s) {

        String[] arr = {"zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine"};

        // 영단어를 통해 숫자로 변환
        for (int i=0; i<arr.length; i++) {
            s = s.replaceAll(arr[i], String.valueOf(i));
        }

        // 문자열을 정수로 변환해 제출
        return Integer.parseInt(s);
    }
}
