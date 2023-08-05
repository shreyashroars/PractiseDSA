# Write your MySQL query statement below
# select author_id as id from Views group by author_id,viewer_id having author_id=viewer_id order by author_id;
select distinct author_id as id from Views where author_id=viewer_id order by author_id;
