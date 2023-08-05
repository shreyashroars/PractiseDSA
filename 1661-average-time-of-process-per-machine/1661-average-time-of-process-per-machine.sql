# Write your MySQL query statement below
SELECT machine_id,ROUND(AVG(time_diff), 3) AS processing_time
FROM ( 
    SELECT machine_id, MAX(timestamp) - MIN(timestamp) AS time_diff
    FROM Activity
    GROUP BY machine_id,process_id
) AS time_diff_table
GROUP BY machine_id;