# Write your MySQL query statement below
select c1.name from Customer c1 where c1.id not in(select c2.id from Customer c2 where c2.referee_id=2);