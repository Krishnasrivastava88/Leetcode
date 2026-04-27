class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // If fast is null, it means remove head
        if (fast == null) {
            return head.next;
        }

        // Move both until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the next node of slow
        slow.next = slow.next.next;
        return head;
    }
}
