--https://school.programmers.co.kr/learn/courses/30/lessons/301649
--대장균의 크기에 따라 분류하기 2

SELECT
    ID,
    CASE WHEN CLASS = 1 THEN 'CRITICAL'
        WHEN CLASS = 2 THEN 'HIGH'
        WHEN CLASS = 3 THEN 'MEDIUM'
        WHEN CLASS = 4 THEN 'LOW'
        END AS COLONY_NAME
    FROM (
        SELECT
            ID,
            NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS CLASS
        FROM ECOLI_DATA
    ) AS RANK_TABLE ORDER BY ID;

