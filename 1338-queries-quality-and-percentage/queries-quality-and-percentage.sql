# Write your MySQL query statement below
SELECT query_name, IFNULL(ROUND(AVG(rating/position),2),0) AS quality,
ROUND(avg(IF(rating<3,1,0))*100,2) AS poor_query_percentage from Queries group by  query_name;