package programmers;

public class Problem038 {
    //http://school.programmers.co.kr/learn/courses/30/lessons/12918
    //연습문제

    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6){
            return false;
        }

        return s.chars().filter(c -> !Character.isDigit(c)).count() == 0;
    }
}
