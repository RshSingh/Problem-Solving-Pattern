// class ListNode {
//     int val;
//     ListNode next;
// }

public class ReorderList {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode node = head;
        ListNode next = prev;

        while(next != null) {
            ListNode t1 = node.next;
            ListNode t2 = next.next;

            node.next = next;
            next.next = t1;

            node = t1;
            next = t2;
        }
    }
}