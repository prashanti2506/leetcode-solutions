class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

/*
Local test cases:
1. head = [1,2,3,4,5] -> [5,4,3,2,1]
2. head = [1,2] -> [2,1]
3. head = [] -> []
*/