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
}
