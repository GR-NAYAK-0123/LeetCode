// Problem: Linked List Cycle
// Link: https://leetcode.com/problems/linked-list-cycle/description/
// Time: O(n)
// Space: O(1)

package LinkedList.Easy;

import java.util.HashMap;

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

    /* Here is another approach to solve this problem by using HashMap, but it takes O(n) time and O(n) space
       for the HashMap
     */
    public boolean hasCycle1(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp)) return true;
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
}
