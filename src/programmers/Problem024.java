package programmers;

import java.util.ArrayList;
import java.util.List;

public class Problem024 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java
    //스택/큐

    boolean solution(String s) {

        // 시작 문자가 ')' 이라면 바로 false
        if (s.charAt(0) == ')') {return false;}

        // 문자열이 홀수라면 바로 false
        if(s.length()%2 != 0){ return false;}

        List<String> list = new ArrayList<>();
        String[] arr = s.split("");

        for (String str : arr) {
            if(str.equals("(")){
                list.add(str);
            }else if(list.size() == 0 && str.equals(")")){
                // 반복문 진행 중 시작 문자가 ')' 이라면 바로 false
                list.add(str);
                break;
            }else if (str.equals(")") && list.get(list.size() - 1).equals("(")) {
                // "(", ")" 두개 연달아 들어가면 제거
                list.remove(list.size() - 1);
            }
        }

        // 끝났을 때 괄호가 남아있지 않다면 true
        return list.size() == 0;
    }
}
