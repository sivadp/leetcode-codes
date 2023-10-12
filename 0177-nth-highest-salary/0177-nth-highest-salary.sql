CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
        declare result int;
        declare ofset int;
        set ofset=N-1;
       set result=(select distinct salary from employee order by salary desc limit 1 offset ofset);
        return result;
END