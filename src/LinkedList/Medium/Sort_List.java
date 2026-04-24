// Problem: Sort List
// Link: https://leetcode.com/problems/sort-list/description/
// Time: O(n) + O(n log(n)) + O(n)
// Space: O(n)

package LinkedList.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_List {
    // Extreme brute force approach
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for(int i = 0;i<list.size();i++){
            temp.val = list.get(i);
            temp = temp.next;
        }
        return head;
    }
    /*
       This is another way of solving this problem, by using merge sort approach
       It will take O((n + n/2) log(n)) time and O(1) space
     */
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);
        ListNode middleNext = middle.next;
        middle.next = null;

        ListNode fastHalf = mergeSort(head);
        ListNode secondHalf = mergeSort(middleNext);
        return merge(fastHalf, secondHalf);
    }
    public ListNode merge(ListNode fast, ListNode second){
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        while(fast != null && second != null){
            if(fast.val < second.val){
                temp.next = fast;
                temp = temp.next;
                fast = fast.next;
            }
            else{
                temp.next = second;
                temp = temp.next;
                second = second.next;
            }
        }
        if(fast == null) temp.next = second;
        else temp.next = fast;

        return newHead.next;
    }
    public ListNode sortList_1(ListNode head) {
        return mergeSort(head);
    }
}
