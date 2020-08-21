package random.heap._0100;

/**
 * 100. 相同的树
 * @author maoze.yao
 *
 */
public class Solution {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		
		if (p == null && q == null) {
			return true;
		
		} else if (p == null || q == null) {
			return false;
		} else if (p.val != q.val) {
			return false;
		} else {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		
    }
}