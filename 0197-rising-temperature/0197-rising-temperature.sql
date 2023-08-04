# Write your MySQL query statement below
select b.id
from Weather b join Weather a
on datediff(b.recordDate,a.recordDate)=1 and a.temperature<b.temperature