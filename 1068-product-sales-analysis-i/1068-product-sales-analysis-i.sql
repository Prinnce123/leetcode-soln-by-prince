# Write your MySQL query statement below
select p1.product_name,s1.year,s1.price from sales as s1
left outer join Product as p1 
on s1.product_id=p1.product_id
