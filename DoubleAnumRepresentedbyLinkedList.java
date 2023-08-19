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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head, prev = null, newHead = null;

        while (curr != null) {

            curr.val = curr.val * 2;
            // For Carry
            if (curr.val > 9) {
                if (prev == null) { // empty list
                    prev = new ListNode(1, curr);
                    newHead = prev;
                } else {
                    prev.val = prev.val + 1;
                }
                curr.val = curr.val % 10;
            }
            prev = curr;
            curr = curr.next;
        }
        if (newHead != null) {
            return newHead;
        } else {
            return head;
        }
    }
}