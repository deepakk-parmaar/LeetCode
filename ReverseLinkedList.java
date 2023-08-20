import java.util.List;

import AddTwoNumbers.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        return reverseListUtil(prev, head);
    }

    private ListNode reverseListUtil(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }
        ListNode temp = reverseListUtil(curr, curr.next);
        curr.next = prev;
        return temp;
    }
}