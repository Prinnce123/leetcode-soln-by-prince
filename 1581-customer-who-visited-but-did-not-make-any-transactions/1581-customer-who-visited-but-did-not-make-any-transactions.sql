# Write your MySQL query statement below
select v1.customer_id , count(v1.visit_id) as count_no_trans
from Visits v1 left outer join Transactions t1
on v1.visit_id=t1.visit_id
where t1.transaction_id  is null
group by customer_id
