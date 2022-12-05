
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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int node_len = 0;
        while(temp!=null)
        {
            node_len++;
            temp=temp.next;
        }
        int node_mid = node_len/2;
        temp = head;
        while(node_mid>0)
        {
            temp=temp.next;
            node_mid--;
        }
        return temp;
        } 
    }
