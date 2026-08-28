/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
    
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        }

        ListNode head1 = head;
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = head2;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head2 = prev;

        while (head1 != null && head2 != null) {
            ListNode next1 = head1.next;
            ListNode next2 = head2.next;
            head1.next = head2;
            head2.next = next1;
            head1 = next1;
            head2 = next2;
        }

    }
}
