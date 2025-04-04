SELECT
    ANIMAL_TYPE,
    NAME,
    SEX_UPON_INTAKE
FROM (
    SELECT
        ANIMAL_TYPE,
        IFNULL(NAME, 'No name') AS NAME,
        SEX_UPON_INTAKE
    FROM ANIMAL_INS
    ORDER BY ANIMAL_ID) AS SUB

