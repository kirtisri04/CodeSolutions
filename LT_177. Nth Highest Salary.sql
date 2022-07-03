CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
   select max(a.getNthHighestSalary) from (select distinct id,salary as getNthHighestSalary,dense_rank() over (order by salary desc) as ranksal
      from Employee) a  where a.ranksal=N
  );
END