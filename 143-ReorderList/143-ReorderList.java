// Last updated: 4/28/2026, 10:46:34 AM


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

        while(fast.next != null && fast.next.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode middle = slow;
        ListNode reversed = reverseList(middle.next);
        slow.next = null;
        
        ListNode currentHead = head;
        while(reversed != null ) {
            ListNode headTemp = currentHead.next;
            ListNode reversedHeadTemp = reversed.next;

            currentHead.next = reversed;
            reversed.next = headTemp;

            currentHead = headTemp;
            reversed = reversedHeadTemp;

        }



    }


        private ListNode reverseList(ListNode head) {
            ListNode prev = null;

            while(head != null) {
                ListNode nextTemp = head.next;
                head.next = prev;
                prev = head;
                head = nextTemp;
            }

            return prev;
        }

}