## Problem: Valid Anagram (Easy)

**Link:** https://leetcode.com/problems/valid-anagram/

### Approach
Count the frequency of each lowercase English letter in both strings. Increment the count for characters in the first string and decrement it for characters in the second. If every count is zero, the strings are anagrams.

### Complexity
- Time: O(n)
- Space: O(1) because the frequency array has 26 positions.

### Notes
The length check immediately rejects strings with different sizes.