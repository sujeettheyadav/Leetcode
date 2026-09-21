class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = first.next;
        ListNode prev = null;
        while (first != null && second != null) {
            ListNode third = second.next;
            second.next = first;
            first.next = third;
            if (prev != null) {
                prev.next = second;
            } else {
                head = second;
            }
            prev = first;
            first = third;

            if (first != null) {
                second = first.next;
            }
        }
        return head;
    }
}