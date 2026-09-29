## Problem: Best Time to Buy and Sell Stock (Easy)

**Link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

### Approach
Track the lowest price seen so far. At each day, calculate the profit from selling at the current price and keep the maximum profit found.

### Complexity
- Time: O(n)
- Space: O(1)

### Notes
The stock must be bought before it is sold, so the minimum price is updated while scanning from left to right.