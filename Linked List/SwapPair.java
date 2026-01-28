// class ListNode {
//     int val;
//     ListNode next;
// }

public class Solution {
    public ListNode swapPairs(ListNode head) {
        // Your code goes here

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;

        while(node.next != null && node.next.next != null) {
            ListNode a = node.next;
            ListNode b = a.next;

            a.next = b.next;
            b.next = a;
            node.next = b;


            node = a;

        }

        return dummy.next;
    }
}