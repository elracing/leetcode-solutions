// Last updated: 4/28/2026, 10:47:10 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyhead = new ListNode(0);
        ListNode current = dummyhead;

        int carry = 0;


        while (l1 != null || l2 != null || carry != 0){
            int sum1 = 0;
            int sum2 = 0;
            int sum = 0;
            if (l1 != null) {
                sum1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum2 = l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode((sum1 + sum2 + carry) % 10);

            carry = (sum1 + sum2 + carry) / 10;

            
            current.next = node;
            current = current.next;
        }

        return dummyhead.next;
    }
}