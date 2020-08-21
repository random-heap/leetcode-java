package random.heap._0107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 107. 二叉树的层次遍历 II
 * 
 * @author maoze.yao
 *
 */
public class Solution {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null)
			return new ArrayList<>();

		Stack<List<Integer>> stack = new Stack<>(); // 多了一个栈
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		int count;
		q.add(root);
		
		while (!q.isEmpty()) {
			count = q.size();
			List<Integer> list = new ArrayList<>();
			while (count > 0) {
				TreeNode ret = q.remove();
				list.add(ret.val);
				if (ret.left != null)
					q.add(ret.left);
				if (ret.right != null)
					q.add(ret.right);
				count--;
			}
			stack.add(list); // 图片详解见102题，本题只是把list放到栈中
		}
		
		
		while (!stack.isEmpty()) { // 将栈的值放到队列中
			result.add(stack.pop());
		}
		return result;

	}

}
