## Problem: Reverse Linked List (Easy)

**Link:** https://leetcode.com/problems/reverse-linked-list/

### Approach
Use three references: `prev`, `current`, and `next`. Save the next node, reverse the current node's pointer, then move forward until the list is completely reversed.

### Complexity
- Time: O(n)
- Space: O(1)

### Notes
The list is reversed in place without creating a second linked list.