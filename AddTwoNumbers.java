public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode curr = sum;
        ListNode l1ptr = l1;
        ListNode l2ptr = l2;
        int carry = 0;
        while (l1ptr != null || l2ptr != null) {
            int node = 0;
            if (l1ptr != null) {
                node += l1ptr.val;
            }
            if (l2ptr != null) {
                node += l2ptr.val;
            }
            node += carry;
            carry = node / 10;
            ListNode newNode = new ListNode(node % 10);
            curr.next = newNode;
            curr = curr.next;
            l1ptr = l1ptr.next;
            l2ptr = l2ptr.next;
        }

        return sum.next;
    }
}
