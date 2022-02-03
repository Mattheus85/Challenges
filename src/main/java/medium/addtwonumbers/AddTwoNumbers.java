package medium.addtwonumbers;

public class AddTwoNumbers {

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p, dummy = new ListNode(0);
        p = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(carry%10);
            carry /= 10;
            p = p.next;
        }
        return dummy.next;
    }*/

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = l1!=null?l1:(l2!=null?l2:(new ListNode(0)));
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }*/

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
        ListNode head = new ListNode(val % 10);
        head.next = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
        if (val >= 10) head.next = addTwoNumbers(head.next, new ListNode(1));
        return head;
    }*/
}
