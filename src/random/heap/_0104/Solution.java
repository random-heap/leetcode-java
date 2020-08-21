package random.heap._0104;

/**
 * 	104.二叉树的最大深度  
 * @author maoze.yao
 *
 */
public class Solution {

	public int maxDepth(TreeNode root) {
		
		if (root == null) {
			return 0;
		} else {
			
			int leftHight = maxDepth(root.left);
			int rightHight = maxDepth(root.right);
			return Math.max(leftHight, rightHight) + 1;			
		}
    }
}
