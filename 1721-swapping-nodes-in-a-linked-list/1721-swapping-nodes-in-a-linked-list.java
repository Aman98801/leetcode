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
        int count = 0;
        ListNode current = head;
        ListNode start = head;
        while(current != null){
            current = current.next;
            count++;
        }
        
        int[] arr = new int[count];
        
        for(int i=0;i<count;i++){
            arr[i] = start.val;
            start = start.next;
        }
      // swapping
        int temp = arr[k-1];
        arr[k-1] = arr[arr.length-k];
        arr[arr.length-k] = temp;
        
        // change array to listNode
        
        ListNode update = head;
        
        for(int i=0;i<arr.length;i++){
            update.val = arr[i];
            update = update.next;
        }
        return head;
        
        
    }
}