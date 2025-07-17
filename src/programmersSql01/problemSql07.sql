--https://school.programmers.co.kr/learn/courses/30/lessons/299305
--대장균들의 자식의 수 구하기

SELECT
    ED.ID,
    COUNT(CD.ID) AS CHILD_COUNT
FROM ECOLI_DATA ED
LEFT JOIN ECOLI_DATA CD ON ED.ID = CD.PARENT_ID
GROUP BY ED.ID
ORDER BY ED.ID