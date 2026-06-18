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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        Stack<Integer> stack=new Stack<>();
        while(curr!=null){
            stack.push(curr.val);
            curr=curr.next;
        }
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==stack.peek()){
                stack.pop();
            }
            temp=temp.next;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}