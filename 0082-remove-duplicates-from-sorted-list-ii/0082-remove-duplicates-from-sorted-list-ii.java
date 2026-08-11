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
        ListNode c=head;
        ListNode p=null;
        if(head==null) return null;
        while(c!=null){
            if(c.next!=null && c.val==c.next.val){
                int val=c.val;
                while(c!=null && c.val==val){
                    c=c.next;
                }
                if(p!=null) p.next=c;
                else head=c;
            }
            else{ p=c; c=c.next;}
        }
        return head;
    }
}