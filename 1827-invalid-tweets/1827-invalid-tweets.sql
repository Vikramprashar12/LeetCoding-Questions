# Write your MySQL query statement below

# Step 1: Understand output table format: tweet_id .
# Step 2: Understand filtering conditions: 'content' column greater than 15 is invalid tweet.

select tweet_id from Tweets where Length(content) > 15;