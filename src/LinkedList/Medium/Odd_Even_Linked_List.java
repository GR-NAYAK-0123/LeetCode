// Problem: Odd Even Linked List
// Link: https://leetcode.com/problems/odd-even-linked-list/description/
// Time: O(n)
// Space: O(1)

package LinkedList.Medium;

public class Odd_Even_Linked_List {
    // This is the basic/naive approach to solve this one
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode even = head.next;
        ListNode oddLast = head;
        ListNode evenLast = even;
        ListNode on = oddLast.next.next;
        while(on != null){
            oddLast.next = on;
            oddLast = on;
            if(on.next != null){
                evenLast.next = on.next;
                evenLast = on.next;
            }
            else break;
            on = on.next.next;
        }
        oddLast.next = even;
        evenLast.next = null;
        return head;
    }
}
