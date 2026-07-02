# Write your MySQL query statement below
-- select id from Weather order by temperature desc limit 2;
 
select a.id

from Weather a 

JOIN Weather b

ON DATE_ADD(b.recordDate , INTERVAL 1 DAY )= a.recordDate 

WHERE a.temperature>b.temperature 