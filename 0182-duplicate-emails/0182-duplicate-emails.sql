# Write your MySQL query statement below
select s.email from (select email,count(email) as counter from person group by email) as s where s.counter>1;