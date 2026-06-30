# Write your MySQL query statement below
select employee_id from Employees where salary<30000
 &&

manager_id not in(select employee_id from Employees)
-- &&
-- manager_id is not null

order by employee_id;