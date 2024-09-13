# Write your MySQL query statement below

# Step 1: Understand output table format: author_id as id.
# Step 2: Filter using WHERE and order using ORDER BY.

select author_id as id from Views where author_id = viewer_id group by id order by id asc;