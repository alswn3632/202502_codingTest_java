--https://school.programmers.co.kr/learn/courses/30/lessons/59044?language=mysql
--오랜 기간 보호한 동물(1)

SELECT
    AI.NAME,
    AI.DATETIME
FROM ANIMAL_INS AI
    LEFT JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE AO.DATETIME IS NULL
ORDER BY AI.DATETIME LIMIT 3