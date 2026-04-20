// Problem: Reverse Linked List
// Link: https://leetcode.com/problems/reverse-linked-list/description/
// Time: O(n)
// Space: O(1)

package LinkedList.Easy;

public class Reverse_Linked_List {
    // Best Approach to solve this problem
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

    /* This is the recursive approach to reverse the linked list, It takes O(n) time and O(n) recursive stack
       space
     */
    public ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode reverse = reverseList1(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return reverse;
    }
}
