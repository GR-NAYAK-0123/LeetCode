// Problem: Intersection of Two Linked Lists
// Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
// Time: O(n) + O(m) + O(n)
// Space: O(1)

package LinkedList.Easy;

public class Intersection_of_Two_Linked_Lists {
    // Basic approach to solve this problem
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len_a = 0;
        int len_b = 0;
        ListNode temp = headA;
        while(temp != null){
            len_a++;
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            len_b++;
            temp = temp.next;
        }
        int diff = 0;
        if(len_a > len_b){
            diff = len_a - len_b;
            temp = headA;
            while(diff != 0){
                diff--;
                temp = temp.next;
            }
            ListNode temp1 = headB;
            while(temp1 != null){
                if(temp1 == temp) return temp1;
                temp = temp.next;
                temp1 = temp1.next;
            }
        }
        else{
            diff = len_b - len_a;
            temp = headB;
            while(diff != 0){
                diff--;
                temp = temp.next;
            }
            ListNode temp1 = headA;
            while(temp1 != null){
                if(temp1 == temp) return temp1;
                temp = temp.next;
                temp1 = temp1.next;
            }
        }
        return null;
    }
}
