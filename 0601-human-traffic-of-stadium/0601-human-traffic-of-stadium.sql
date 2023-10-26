# Write your MySQL query statement below
select s1.*
from Stadium s1
join Stadium s2 on s1.id=s2.id-1
join Stadium s3 on s2.id=s3.id-1
where s1.people>=100 and s2.people>=100 and s3.people>=100
union 
select s2.*
from Stadium s1
join Stadium s2 on s1.id=s2.id-1
join Stadium s3 on s2.id=s3.id-1
where s1.people>=100 and s2.people>=100 and s3.people>=100
union
select s3.*
from Stadium s1
join Stadium s2 on s1.id=s2.id-1
join Stadium s3 on s2.id=s3.id-1
where s1.people>=100 and s2.people>=100 and s3.people>=100
order by visit_date;