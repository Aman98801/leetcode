My code 46/77 cases passes
​
​
class Solution {
public ListNode removeElements(ListNode head, int val) {
ListNode current = head;
ListNode previous = null;
if(head == null){
return null;
}
else if(head.val == val) head = head.next;
else{
while(current != null){
if(current.val != val){
previous = current;
current = current.next;
}
else{
previous.next = current.next;
current = current.next;
}
}
}
return head;
}
}