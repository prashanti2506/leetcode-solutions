## Problem: Valid Parentheses (Easy)

**Link:** https://leetcode.com/problems/valid-parentheses/

### Approach
Use a stack. Push every opening bracket. For each closing bracket, check that the most recent opening bracket is its matching pair. At the end, the stack must be empty.

### Complexity
- Time: O(n)
- Space: O(n)

### Notes
A closing bracket with an empty stack or a mismatched opening bracket makes the string invalid.