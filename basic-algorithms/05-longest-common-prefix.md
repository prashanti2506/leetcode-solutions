## Problem: Longest Common Prefix (Easy)

**Link:** https://leetcode.com/problems/longest-common-prefix/

### Approach
Start with the first string as the prefix. For each following string, shorten the prefix until that string starts with it. If the prefix becomes empty, return an empty string.

### Complexity
- Time: O(S) approximately, where S is the total number of characters examined.
- Space: O(1) auxiliary space.

### Notes
The solution compares the common prefix progressively instead of comparing every pair of strings.