# Write your MySQL query statement below
select *,
if(x+y>z && x+z>y && z+y>x , 'Yes' , 'No')
as triangle 
from Triangle