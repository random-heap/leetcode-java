package random.heap._0027;

/**
 * 27. 移除元素
 * @author maoze.yao
 *
 */
public class Solution {

	public int removeElement(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}
    
    public static void main(String[] args) {
    	
    	int[] nums = new int[]{4,2,0,2,2,1,4,4,1,4,3,2};
    	
    	Solution solution = new Solution();
		System.out.println(solution.removeElement(nums, 4));
	}
}
