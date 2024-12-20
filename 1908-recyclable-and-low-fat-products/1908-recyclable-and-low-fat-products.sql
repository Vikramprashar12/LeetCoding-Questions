# Write your MySQL query statement below
# Step 1: Output Format is going to be just one column, product_id.
# Step 2a: Create subquery filtered for only 'Y' in the low_fats column.
# Step 2b: Create subquery filtered for only 'Y' in the recyclable column.
# Step 3: Inner Join the two queries.

SELECT product_id FROM Products WHERE low_fats = "Y" AND recyclable = "Y"