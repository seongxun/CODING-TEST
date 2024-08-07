-- 코드를 입력하세요
SELECT ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.ANIMAL_TYPE, ANIMAL_INS.NAME 
FROM ANIMAL_INS
LEFT JOIN ANIMAL_OUTS
ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID 
AND ANIMAL_INS.SEX_UPON_INTAKE LIKE 'Intact%'
WHERE ANIMAL_OUTS.SEX_UPON_OUTCOME LIKE'Neutered%'
OR ANIMAL_OUTS.SEX_UPON_OUTCOME LIKE 'Spayed%';