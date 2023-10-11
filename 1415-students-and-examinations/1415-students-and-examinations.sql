# Write your MySQL query statement below
select st.student_id,st.student_name,st.subject_name,count(e.subject_name) as attended_exams from (select * from students st cross join subjects s) as st left join examinations e on st.student_id=e.student_id and st.subject_name=e.subject_name group by st.student_id,st.subject_name,e.subject_name order by st.student_id,st.subject_name;