package random.heap._0035;

/**
 * 35. 搜索插入位置
 * @author maoze.yao
 *
 */
public class Solution {
	
	public int searchInsertBest(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

	public int searchInsert(int[] nums, int target) {

		if (nums.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target)
				return i;
		}
		
		return 0;
    }
	
	public static void main(String[] args) {
		
	}
}
