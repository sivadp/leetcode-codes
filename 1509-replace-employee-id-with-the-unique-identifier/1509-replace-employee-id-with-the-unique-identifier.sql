# Write your MySQL query statement below
select unique_id,name from EmployeeUNI e right JOIN Employees u on e.id=u.id;