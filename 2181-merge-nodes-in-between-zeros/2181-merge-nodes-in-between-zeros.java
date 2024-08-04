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
    public ListNode mergeNodes(ListNode head) {
        if (head.next==null) return null;
         ListNode cur=head.next;
        int sum=0;
        while(cur.val != 0) {
            sum+=cur.val;
            cur=cur.next;
        }
         head.next.val=sum;
         head.next.next=mergeNodes(cur);
        return head.next;
    }
}