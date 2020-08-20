package random.heap._0053;

/**
 * 53. 最大子序和
 * @author maoze.yao
 *
 */
public class Solution {

	public int maxSubArray(int[] nums) {
		
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] + nums[i-1] > nums[i]) {
				
				//索引i的位置是前i个值的和
	            nums[i] += nums[i-1];
	        }
	        if (nums[i] > max) {
	            max = nums[i];
	        }
	    }
	    return max;

    }
}
