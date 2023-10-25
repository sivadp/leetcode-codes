select round(sum(tiv_2016),2) as tiv_2016 from insurance where tiv_2015 in (SELECT tiv_2015 FROM insurance GROUP BY tiv_2015 HAVING COUNT(*) > 1) and (lat,lon) in (
select lat,lon from insurance group by lat,lon having count(*)=1);
