// class ListNode {
//     int val;
//     ListNode next;
// }

public class IsPalindrome {
    public Boolean isPalindrome(ListNode head) {

        List<Integer> list = new ArrayList<>();
        ListNode currentNode = head;
        while(currentNode != null) {
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int start = 0;
        int end = list.size()-1;

        while(start < end) {
            if(!list.get(start).equals(list.get(end))) return false;
            start++;
            end--;
        }

        return true;
    }
}