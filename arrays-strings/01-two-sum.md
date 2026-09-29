## Problem: Two Sum (Easy)

**Link:** https://leetcode.com/problems/two-sum/

### Approach
Use a HashMap to store each number and its index while scanning the array. For every number, check whether its complement (`target - nums[i]`) has already been seen. If it has, return the two indices.

### Complexity
- Time: O(n)
- Space: O(n)

### Notes
Tested with the standard examples and a case containing the required pair. The HashMap avoids checking every pair with nested loops.