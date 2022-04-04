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
    public ListNode swapNodes(ListNode head, int k) {
        k -= 1;
        ListNode firstNode = head;
        while(k > 0) {
            firstNode = firstNode.next;
            k--;
        }
        ListNode f = firstNode;
        ListNode secondNode = head;
        while(f.next != null) {
            secondNode = secondNode.next;
            f = f.next;
        }
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
        return head;
    }
}