// Problem: Linked List Cycle
// Link: https://leetcode.com/problems/linked-list-cycle/description/
// Time: O(n)
// Space: O(1)

package LinkedList.Easy;

public class Linked_List_Cycle {
    // Best approach to solve this problem
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
