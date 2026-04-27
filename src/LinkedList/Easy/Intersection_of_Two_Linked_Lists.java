// Problem: Intersection of Two Linked Lists
// Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
// Time: O(n) + O(m) + O(diff) + O(n or m)
// Space: O(1)

package LinkedList.Easy;

import java.util.HashMap;

public class Intersection_of_Two_Linked_Lists {
    // Basic approach to solve this problem
    public ListNode meeting_point(ListNode small, ListNode big, int diff){
        ListNode temp = big;
        while(diff != 0){
            diff--;
            temp = temp.next;
        }
        ListNode temp1 = small;
        while(temp != temp1){
            temp = temp.next;
            temp1 = temp1.next;
        }
        return temp;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n = 0;
        int m = 0;
        ListNode temp = headA;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            m++;
            temp = temp.next;
        }

        if(n > m) return meeting_point(headB, headA, n - m);
        else return meeting_point(headA, headB, m - n);
    }
    /*
       This is brute force approach by using HashMap and it took O(n) + O(m) time and O(n) space
     */
    public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = headA;
        while(temp != null){
            map.put(temp, 1);
            temp = temp.next;
        }

        temp = headB;
        while(temp != null){
            if(map.containsKey(temp)) return temp;
            temp = temp.next;
        }
        return null;
    }
}
