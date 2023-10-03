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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode hm = head;
        while(hm != null)
        {
            while(hm.next != null && hm.val == hm.next.val)
            {
                hm.next = hm.next.next;
            }
            hm = hm.next;
        }
        return head;
        
    }
}