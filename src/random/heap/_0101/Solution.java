package random.heap._0101;

/**
 * 101. 对称二叉树  
 * @author maoze.yao
 *
 */
public class Solution {

	public boolean isSymmetric(TreeNode root) {
    
		if (root == null) {
			return true;
		}
		
		TreeNode p = root.left;
		TreeNode q = root.right;
		
		if (p == null && q == null) {
			return true;
		}
		
		if (p == null || q == null) {
			return false;
		}
		
		return check(p, q);
		
    }
	
	public boolean check(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

		return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
	}
}
