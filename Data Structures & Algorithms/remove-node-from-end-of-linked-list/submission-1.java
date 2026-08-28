class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode counter = head;

        while (counter != null) {
            counter = counter.next;
            length++;
        }

        // Removing the first node
        if (n == length) {
            return head.next;
        }

        int int_counter = 0;
        counter = head;
        ListNode prev = null;

        while (int_counter != length - n) {
            prev = counter;
            counter = counter.next;
            int_counter++;
        }

        prev.next = counter.next;

        return head;
    }
}