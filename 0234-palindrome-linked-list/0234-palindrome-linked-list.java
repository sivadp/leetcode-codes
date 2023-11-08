class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        Stack<Integer> stacker = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            stacker.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the length of the linked list is odd, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (stacker.isEmpty() || stacker.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}
