## Problem: Binary Search (Easy)

**Link:** https://leetcode.com/problems/binary-search/

### Approach
Use two pointers representing the current search range. Check the middle element and discard the half that cannot contain the target.

### Complexity
- Time: O(log n)
- Space: O(1)

### Notes
Binary search requires the input array to be sorted.