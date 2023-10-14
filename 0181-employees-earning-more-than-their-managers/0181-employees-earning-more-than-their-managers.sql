# Write your MySQL query statement below
select s.name as Employee from (select e1.name,e1.salary as emp,e2.salary as man from Employee e1 join Employee e2 on e1.managerid=e2.id) as s where s.emp>s.man;