CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N=N-1;
  RETURN (
   SELECT DISTINCT salary as getNthHighestSalary
   FROM Employee 
   ORDER BY salary DESC
   LIMIT 1 
   OFFSET n
   
   );
END