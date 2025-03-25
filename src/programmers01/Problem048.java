package programmers01;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Problem048 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42587
    //스택/큐

    public int solution(int[] priorities, int location) {
        int answer = 0; // 결과

        // 가상의 프로세스 명(A,B,C...)과 중요도를 저장할 Map
        Map<Character,Integer> map = new HashMap<>();
        // 실행 대기 큐
        Queue<Character> que = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            // 가상의 프로세스 명 생성
            char ch = (char)('A'+i);
            // Map, Queue에 담기
            map.put(ch, priorities[i]);
            que.add(ch);
        }

        while(!que.isEmpty()){
            // 대기 큐에서 검증할 프로세스 꺼내기
            char cur = que.poll();
            boolean op = false;

            // 대기 큐에서 현재 프로세스보다 중요도 높은 프로세스가 있는지 확인
            for(char ch : que){
                if(map.get(ch)>map.get(cur)){
                    op = true;
                    break;
                }
            }

            if(op){
                // 1. 존재한다면 대기 큐에 다시 넣고 재검증
                que.add(cur);
            }else{
                // 2. 존재하지 않는다면 실행, answer(실행 회차) 증가
                answer++;
                if((char)('A'+location) == cur){
                    // 3. 궁금한 프로세스가 나오면 반복문 탈출
                    return answer;
                }
            }
        }

        return 0;
    }
}
