select s.id,count(s.id) as num from (select requester_id as id from RequestAccepted 
union all
select accepter_id as id from RequestAccepted) as s group by s.id order by num desc limit 1;
