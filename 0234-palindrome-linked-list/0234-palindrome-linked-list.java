class Solution {
    public boolean isPalindrome(ListNode head) {
        // Edge-case : 
        if(head==null && head.next==null){
            return true;
        }

        // Step 1 --> find mid of list (i.e slow)
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2 --> reverse list from mid 
        ListNode prev = null;
        ListNode current = slow;

        while(current!=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // put mid.next = null to divide list into two part (here, slow = mid)
        slow.next = null;

        // Step 3 --> Iterate over both the lists and check if the value of nodes are equal or not if not equal then it is not palindrome list
        ListNode p1 = head;
        ListNode p2 = prev;

        while(p1!=null && p2!=null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}