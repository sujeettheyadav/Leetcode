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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int l=1;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            l++;
            curr=curr.next;
        }
        ListNode start=head;
        k=k%l;
        if(k==0) return head;
        int divider=l-k;
        for(int i=1;i<divider;i++){
            start=start.next;
        }
        ListNode newHead=start.next;
        start.next=null; 
        curr.next=head;
        return newHead; 
    }
}