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
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode half = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (half != null) {
            ListNode nxt = half.next;
            half.next = prev;
            prev = half;
            half = nxt;
        }
        half = prev;
        ListNode first = head;
        while (half != null) {
            ListNode t1 = first.next;
            ListNode t2 = half.next;
            first.next = half;
          half.next = t1;
            first = t1;
            half = t2;
        }
    }
}