class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode result = dummy;

        while (head != null) {
            int count = 1;
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
                count++;
            }

            if (count == 1) {
                result.next = head;
                result = result.next;
            }

            head = head.next;
        }

        result.next = null; // Ensure the last node is properly disconnected
        return dummy.next;
    }
}
