# Write your MySQL query statement below
SELECT a.name as Employee
FROM Employee a JOIN
Employee b ON a.managerid=b.id
WHERE a.salary>b.salary;