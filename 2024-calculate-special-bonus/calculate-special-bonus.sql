# Write your MySQL query statement below
select employee_id,
if(employee_id%2=1 
&&
 not name like "M%", salary,0)
as bonus from Employees order by employee_id;