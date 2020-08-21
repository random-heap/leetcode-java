package random.heap._0141;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 * @author maoze.yao
 *
 */
public class Solution {
	
	public boolean hasCycleBest(ListNode head) {
		
		if (head == null || head.next == null) {
			return false;
		}
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while (slow != fast) {
			
			if (fast == null || fast.next == null) {
				return false;
			}
			
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		return true;
		
	}

	public boolean hasCycle(ListNode head) {
        
		Set<ListNode> set = new HashSet<>();
		while (head != null) {
			
			if (set.contains(head)) {
				return true;
			} else {
				set.add(head);
			}
			
			head = head.next;
		}
		
		return false;
		
    }
}
