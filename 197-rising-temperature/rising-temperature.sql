# Write your MySQL query statement below
-- select id from Weather order by temperature desc limit 2;
 
select a.id

from Weather a 

JOIN Weather b

ON DATEDIFF(a.recordDate,b.recordDate)=1 

WHERE a.temperature>b.temperature 