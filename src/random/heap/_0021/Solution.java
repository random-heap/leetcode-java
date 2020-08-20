package random.heap._0021;

/**
 * 21. 合并两个有序链表
 * @author maoze.yao
 *
 */
public class Solution {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

		ListNode dummyNode = new ListNode(0, null);
		ListNode cur = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
            	cur.next = l1;
                l1 = l1.next;
            } else {
            	cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        cur.next = l1 == null ? l2 : l1;

        return dummyNode.next;
 
		
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode d1 = new ListNode(1);
		ListNode d2 = new ListNode(2);
		ListNode d3 = new ListNode(4);
		
		l1.next = d1;
		d1.next = d2;
		d2.next = d3;
		
		ListNode l2 = new ListNode(0);
		ListNode d4 = new ListNode(1);
		ListNode d5 = new ListNode(3);
		ListNode d6 = new ListNode(4);
		
		l2.next = d4;
		d4.next = d5;
		d5.next = d6;
		
		Solution solution = new Solution();
		print(solution.mergeTwoLists(l1.next, l2.next));;

	}
	
	public static void print(ListNode node) {
		
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
		
	}
}
