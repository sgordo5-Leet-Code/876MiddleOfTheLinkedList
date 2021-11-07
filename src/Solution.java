public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;

        while (fast.next != null) {
            if (count % 2 == 0) {
                slow = slow.next;
            }
            fast = fast.next;
            count++;
        }

        return slow;
    }
}
