--https://school.programmers.co.kr/learn/courses/30/lessons/59043
--있었는데요 없었습니다

SELECT
    AI.ANIMAL_ID,
    AI.NAME
FROM ANIMAL_INS AI
    INNER JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE AO.DATETIME < AI.DATETIME
ORDER BY AI.DATETIME

--제목귀여웡