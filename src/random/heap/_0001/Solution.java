package random.heap._0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 * @author maoze.yao
 *
 */
public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
        
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			
			int num = nums[i];
			int key = target - num;
			Integer value = map.get(key);
			if (value != null) {
				return new int[]{value, i};
			}
			
			//Map中保存值，方便下一次循环
			map.put(num, i);
		}
		
		return new int[]{};
		
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
        int[] nums = new int[]{2, 11, 7, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
	}
}
