
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
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0), after = new ListNode(0);
        ListNode dummy1 = before, dummy2 = after;
        while (head.next != null) {
            if (head.val < x) {
                before = before.next;
                before = head;
            } else {
                after = after.next;
                after = head;
            }
            head = head.next;
        }
        after.next = null;
        before.next = dummy2.next;
        return dummy1.next;
    }
}