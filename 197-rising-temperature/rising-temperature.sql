# Write your MySQL query statement below
SELECT w1.id FROM Weather w1, Weather r WHERE 
DATEDIFF(w1.recordDate,r.recordDate)=1 
AND
w1.temperature > r.temperature;