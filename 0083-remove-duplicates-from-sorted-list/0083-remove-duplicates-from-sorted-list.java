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
        if (head==null){
            return head;
        }
        ListNode low=head,high=head.next;
        while(high!=null){
            if(low.val==high.val){
                low.next=high.next;
                high=high.next;
            }else{
                low=high;
                high=high.next;
            }
        }
        return head;
        
    }
}