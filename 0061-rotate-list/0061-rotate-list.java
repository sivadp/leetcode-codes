class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Calculate the length of the linked list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Adjust k to avoid unnecessary rotations
        k = k % length;
        if (k == 0) {
            return head; // No rotation needed
        }
        ListNode newTail=head;
        for(int i=0;i<length-k-1;i++){
            newTail=newTail.next;
        }
        ListNode rotated=newTail.next;
        newTail.next=null;
        ListNode current=rotated;
        while(current.next!=null){
            current=current.next;
        }
        current.next=head;
        return rotated;
    }
}
