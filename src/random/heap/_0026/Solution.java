package random.heap._0026;

/**
 * 26. 删除排序数组中的重复项
 * @author maoze.yao
 *
 */
public class Solution {

	public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index-1]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}
