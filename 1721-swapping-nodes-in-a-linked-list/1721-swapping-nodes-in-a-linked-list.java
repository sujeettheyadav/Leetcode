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
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;

        }
        int arr[]=new int[l];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;

        }
        int left = k - 1;
        int r = arr.length - k;
        int tp = arr[left];
        arr[left] = arr[r];
        arr[r] = tp;

        int z=0;
        temp=head;
        while(temp!=null){
            temp.val=arr[z];
            z++;
            temp=temp.next;
        }
        return head;

    }
}