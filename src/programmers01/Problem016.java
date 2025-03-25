package programmers01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem016 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/150370/solution_groups?language=java
    //2023 KAKAO BLIND RECRUITMENT [개인정보 수집 유효기간]

    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        // 문자열을 날짜 형식으로 변환
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate curDate = LocalDate.parse(today, dtf);

        // 유효기간 정보를 Map에 보관
        Map<String,Integer> map = new HashMap<>();
        for(String term : terms){
            String[] arr1 = term.split(" ");
            map.put(arr1[0], Integer.parseInt(arr1[1]));
        }

        // 결과 도출
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<privacies.length; i++){
            String[] arr2 = privacies[i].split(" ");
            LocalDate regDate = LocalDate.parse(arr2[0], dtf);
            LocalDate dueDate = regDate.plusMonths(map.get(arr2[1]));

            if(curDate.isAfter(dueDate) || curDate.isEqual(dueDate)){
                list.add(i+1);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
