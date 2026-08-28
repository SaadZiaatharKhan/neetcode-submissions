/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *len = head;
        int lenght = 0;
        while (len) {
            lenght++;
            len = len -> next;
        }
        if (lenght == n) return head -> next;
        if (n > lenght) return head;
        int remove = lenght - n, cnt = 1;
        ListNode* prev = head;
        ListNode* forward = head -> next;
        while (cnt != remove) {
            forward = forward -> next;
            prev = prev -> next;
            cnt++;
        }
        prev -> next = forward -> next;
        return head;

    }
};
