# Write your MySQL query statement below
SELECT customer_id,count(visit_id) as count_no_trans FROM
Visits where visit_id NOT IN ( 
    SELECT visit_id from Transactions
)
group by customer_id;
