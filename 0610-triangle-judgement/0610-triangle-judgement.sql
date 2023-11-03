# Write your MySQL query statement below
select x,y,z,
case 
when abs(x)+abs(y)>abs(z) && abs(x)+abs(z)>abs(y) && abs(y)+abs(z)>abs(x) then "Yes"
else "No"
end as triangle from triangle;