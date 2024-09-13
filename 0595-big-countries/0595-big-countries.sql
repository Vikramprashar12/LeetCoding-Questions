# Write your MySQL query statement below

# Step 1: Understand output table format: name, population, area.
# Step 2: Filtering using the WHERE clause.

select name, population, area from World where population >= 25000000 or area >= 3000000;