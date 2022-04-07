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
       
        ListNode first = head, second = head, kNode;
        
        for (int i = 1; i < k; i++) first = first.next;
        
        kNode = first;
        first = first.next;
        
        while(first != null) {
            first = first.next;
            second = second.next;
        }
        
//         swap
        int temp = kNode.val;
        kNode.val = second.val;
        second.val = temp;
        return head;
        
    }
}