// Last updated: 4/28/2026, 10:47:06 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode();
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode nodeAtN = dummy;
        ListNode nodeAtEnd = dummy; 

        for (int i = 1; i <= n; i++){
            nodeAtEnd = nodeAtEnd.next;
        }

        while (nodeAtEnd != null){
            nodeAtEnd = nodeAtEnd.next;
            prev = nodeAtN;
            nodeAtN = nodeAtN.next;

        }

        prev.next = nodeAtN.next;

        return dummy.next;
    }
}