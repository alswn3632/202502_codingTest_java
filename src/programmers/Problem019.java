package programmers;

public class Problem019 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/49993
    //Summer/Winter Coding(~2018) [스킬트리]

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String tree : skill_trees){
            // skill에 없는 원소는 제외 - 불필요한 검증 제거
            tree = tree.replaceAll("[^" + skill + "]","");

            // skill 순서 검증
            if(tree.equals(skill.substring(0,tree.length()))){
                answer++;
            }
        }

        return answer;
    }
}
