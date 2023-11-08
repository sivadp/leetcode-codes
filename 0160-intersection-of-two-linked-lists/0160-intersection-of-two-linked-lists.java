/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> setter=new HashSet<>();
        ListNode a=headA;
        while(a!=null){
            setter.add(a);
            a=a.next;
        }
        ListNode b=headB;
        while(b!=null){
            if(setter.contains(b)){
                return b;
            }
            b=b.next;
        }
        return null;
    }
}