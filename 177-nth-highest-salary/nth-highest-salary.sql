CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
     WITH RankedSalaries AS (
        SELECT e.salary, DENSE_RANK() OVER (ORDER BY e.salary DESC) AS rnk
        FROM Employee e
    )
    SELECT DISTINCT r.salary
    FROM RankedSalaries r
    WHERE r.rnk = N
    
      
  );
END;
$$ LANGUAGE plpgsql;