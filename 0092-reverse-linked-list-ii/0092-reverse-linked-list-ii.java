class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move to the node before the sublist to be reversed
        ListNode first = dummy;
        for (int i = 0; i < left - 1; i++) {
            first = first.next;
        }

        // Reverse the sublist
        ListNode second = first.next;
        ListNode newList = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode next = second.next;
            second.next = newList;
            newList = second;
            second = next;
        }

        // Connect the reversed sublist to the rest of the list
        first.next.next = second;
        first.next = newList;

        return dummy.next;
    }
}
