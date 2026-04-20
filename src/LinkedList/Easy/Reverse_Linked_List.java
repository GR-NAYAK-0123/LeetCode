// Problem: Reverse Linked List
// Link: https://leetcode.com/problems/reverse-linked-list/description/
// Time: O(n)
// Space: O(1)

package LinkedList.Easy;

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while(head != null){
            temp = temp.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
