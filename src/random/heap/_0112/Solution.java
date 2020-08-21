package random.heap._0112;

/**
 * 112. 路径总和
 * @author maoze.yao
 *
 */
public class Solution {

	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null) {
			return false;
		} 
		
		if (root.left == null && root.right == null) {
            return sum == root.val;
        }
		
		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
		
    }
}
