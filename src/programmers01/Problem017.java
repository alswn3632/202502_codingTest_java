package programmers01;

import java.util.HashMap;
import java.util.Map;

public class Problem017 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/118666
    //2022 KAKAO TECH INTERNSHIP [성격 유형 검사하기]

    public String solution(String[] survey, int[] choices) {
        String answer = "";

        // 점수판 준비
        Map<String,Integer> map = new HashMap<>();
        String[] arr = {"R","T","C","F","J","M","A","N"};
        for(String str : arr){
            map.put(str,0);
        }

        // 설문조사 결과 점수 부여
        for(int i=0; i<survey.length; i++){
            switch(choices[i]){
                case 1 :
                    map.put(survey[i].split("")[0], map.get(survey[i].split("")[0])+3);
                    break;
                case 2 :
                    map.put(survey[i].split("")[0], map.get(survey[i].split("")[0])+2);
                    break;
                case 3 :
                    map.put(survey[i].split("")[0], map.get(survey[i].split("")[0])+1);
                    break;
                case 4 :
                    // nothing?
                    break;
                case 5 :
                    map.put(survey[i].split("")[1], map.get(survey[i].split("")[1])+1);
                    break;
                case 6 :
                    map.put(survey[i].split("")[1], map.get(survey[i].split("")[1])+2);
                    break;
                case 7 :
                    map.put(survey[i].split("")[1], map.get(survey[i].split("")[1])+3);
                    break;
            }
        }

        // 결과 해석
        answer += map.get("R")>=map.get("T")? "R" : "T";
        answer += map.get("C")>=map.get("F")? "C" : "F";
        answer += map.get("J")>=map.get("M")? "J" : "M";
        answer += map.get("A")>=map.get("N")? "A" : "N";

        return answer;
    }
}
