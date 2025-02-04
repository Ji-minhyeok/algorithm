SELECT
    SUB.SCORE,
    E.EMP_NO,
    E.EMP_NAME,
    E.POSITION,
    E.EMAIL
FROM HR_EMPLOYEES AS E
JOIN(
    SELECT EMP_NO, SUM(SCORE) AS SCORE
    FROM HR_GRADE
    GROUP BY EMP_NO
) AS SUB
ON E.EMP_NO = SUB.EMP_NO
WHERE SUB.SCORE = (SELECT MAX(SCORE)
                  FROM(
                      SELECT SUM(SCORE) AS SCORE
                      FROM HR_GRADE
                      GROUP BY EMP_NO
                  )AS MAX_SUB)

