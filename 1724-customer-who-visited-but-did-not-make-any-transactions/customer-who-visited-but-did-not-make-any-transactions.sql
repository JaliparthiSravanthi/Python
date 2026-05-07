# Write your MySQL query statement below
select visits.customer_id,count(*) as count_no_trans from
visits left join Transactions 
on visits.visit_id=Transactions.visit_id
where Transactions.transaction_id is null
group by customer_id;
