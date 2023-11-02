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
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode lesserNodes=new ListNode(0);
        ListNode point1=lesserNodes;
        ListNode greaterNodes=new ListNode(0);
        ListNode point2=greaterNodes;
        while(head!=null){
            if(head.val<x){
                point1.next=head;
                point1=point1.next;
                head=head.next;
            }
            else{
                point2.next=head;
                point2=point2.next;
                head=head.next;
            }
        }
        point1.next=greaterNodes.next;
        point2.next=null;
        return lesserNodes.next;
    }
}