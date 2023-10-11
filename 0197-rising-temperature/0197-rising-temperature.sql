# Write your MySQL query statement below
SELECT w2.id as Id
FROM Weather w1
JOIN Weather w2 ON w1.recordDate = DATE_sub(w2.recordDate, INTERVAL 1 DAY)
WHERE w2.temperature > w1.temperature;
