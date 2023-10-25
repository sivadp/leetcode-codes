# Write your MySQL query statement below
select e.name from employee e,(select managerId,count(managerId) as c from employee group by managerid having c>4) as s where e.id=s.managerId;