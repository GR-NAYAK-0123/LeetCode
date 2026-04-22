// Problem: Linked List Cycle II
// Link: https://leetcode.com/problems/linked-list-cycle-ii/description/
// Time: O(n)
// Space: O(n) Here is the extra space is for the HashMap

package LinkedList.Medium;

import java.util.HashMap;

public class Linked_List_Cycle_II {
    // Basic Brute force approach to solve this problem
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp)) return temp;
            map.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }

    // Here is the another approach to solve this problem without using the extra space and O(n) time
    public ListNode detectCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
