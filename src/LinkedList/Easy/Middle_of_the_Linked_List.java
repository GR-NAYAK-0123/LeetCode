// Problem: Middle of the Linked List
// Link: https://leetcode.com/problems/middle-of-the-linked-list/description/
// Time: O(n)
// Space: O(1)

package LinkedList.Easy;

public class Middle_of_the_Linked_List {
    // Best approach to solve this problem
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
